CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE IF NOT EXISTS users
(
    id            UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    username      VARCHAR(50)  NOT NULL UNIQUE,
    email         VARCHAR(100) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    is_active     BOOLEAN                  DEFAULT TRUE,
    created_at    TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS projects
(
    id          UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    name        VARCHAR(100) NOT NULL,
    owner_id    UUID         NOT NULL REFERENCES users (id),
    archived_at TIMESTAMP WITH TIME ZONE,
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS project_members
(
    project_id UUID REFERENCES projects (id) ON DELETE CASCADE,
    user_id    UUID REFERENCES users (id) ON DELETE CASCADE,
    role       VARCHAR(20)              DEFAULT 'MEMBER',
    joined_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (project_id, user_id)
);

CREATE TABLE IF NOT EXISTS boards
(
    id          UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    project_id  UUID REFERENCES projects (id) ON DELETE CASCADE,
    name        VARCHAR(100) NOT NULL,
    color_hex   VARCHAR(7)               DEFAULT '#ebecf0',
    is_archived BOOLEAN                  DEFAULT FALSE,
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS task_groups
(
    id          UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    board_id    UUID REFERENCES boards (id) ON DELETE CASCADE,
    name        VARCHAR(100) NOT NULL,
    position    INTEGER      NOT NULL,
    is_archived BOOLEAN                  DEFAULT FALSE,
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS tasks
(
    id            UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    task_group_id UUID REFERENCES task_groups (id) ON DELETE CASCADE,
    creator_id    UUID REFERENCES users (id),
    assignee_id   UUID         REFERENCES users (id) ON DELETE SET NULL,
    title         VARCHAR(200) NOT NULL,
    description   TEXT,
    priority      VARCHAR(20) CHECK (priority IN ('LOW', 'MEDIUM', 'HIGH')),
    position      INTEGER      NOT NULL,
    due_date      TIMESTAMP WITH TIME ZONE,
    is_archived   BOOLEAN                  DEFAULT FALSE,
    created_at    TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS subtasks
(
    id           UUID PRIMARY KEY         DEFAULT gen_random_uuid(),
    task_id      UUID REFERENCES tasks (id) ON DELETE CASCADE,
    description  TEXT    NOT NULL,
    is_completed BOOLEAN                  DEFAULT FALSE,
    position     INTEGER NOT NULL,
    created_at   TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);
