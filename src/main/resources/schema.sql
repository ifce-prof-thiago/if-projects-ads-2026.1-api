-- 1. Tabela de Usuários
CREATE TABLE users
(
    id            UUID PRIMARY KEY         DEFAULT uuidv7(),
    username      VARCHAR(50)  NOT NULL UNIQUE,
    email         VARCHAR(100) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    is_active     BOOLEAN                  DEFAULT TRUE,
    created_at    TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- 2. Tabela de Projetos
CREATE TABLE projects
(
    id          UUID PRIMARY KEY         DEFAULT uuidv7(),
    name        VARCHAR(100) NOT NULL,
    owner_id    UUID         NOT NULL REFERENCES users (id),
    archived_at TIMESTAMP WITH TIME ZONE,
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- 3. Membros do Projeto
CREATE TABLE project_members
(
    project_id UUID REFERENCES projects (id) ON DELETE CASCADE,
    user_id    UUID REFERENCES users (id) ON DELETE CASCADE,
    role       VARCHAR(20)              DEFAULT 'MEMBER', -- RF05: ADMIN, MEMBER, VIEWER
    joined_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (project_id, user_id)
);

-- 4. Tabela de Quadros
CREATE TABLE boards
(
    id          UUID PRIMARY KEY         DEFAULT uuidv7(),
    project_id  UUID REFERENCES projects (id) ON DELETE CASCADE,
    name        VARCHAR(100) NOT NULL,
    color_hex   VARCHAR(7)               DEFAULT '#ebecf0',
    is_archived BOOLEAN                  DEFAULT FALSE, -- RF10: Arquivamento
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- 5. Grupos de Tarefas
CREATE TABLE task_groups
(
    id          UUID PRIMARY KEY         DEFAULT uuidv7(),
    board_id    UUID REFERENCES boards (id) ON DELETE CASCADE,
    name        VARCHAR(100) NOT NULL,
    position    INTEGER      NOT NULL, -- RF12: Ordenação dinâmica
    is_archived BOOLEAN                  DEFAULT FALSE,
    created_at  TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- 6. Tarefas
CREATE TABLE tasks
(
    id            UUID PRIMARY KEY         DEFAULT uuidv7(),
    task_group_id UUID REFERENCES task_groups (id) ON DELETE CASCADE,
    creator_id    UUID REFERENCES users (id),
    assignee_id   UUID         REFERENCES users (id) ON DELETE SET NULL,
    title         VARCHAR(200) NOT NULL,
    description   TEXT,
    priority      VARCHAR(20) CHECK (priority IN ('LOW', 'MEDIUM', 'HIGH')),
    position      INTEGER      NOT NULL, -- RF15: Reordenamento
    due_date      TIMESTAMP WITH TIME ZONE,
    is_archived   BOOLEAN                  DEFAULT FALSE,
    created_at    TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);

-- 7. Subtarefas
CREATE TABLE subtasks
(
    id           UUID PRIMARY KEY         DEFAULT uuidv7(),
    task_id      UUID REFERENCES tasks (id) ON DELETE CASCADE,
    description  TEXT    NOT NULL,
    is_completed BOOLEAN                  DEFAULT FALSE,
    position     INTEGER NOT NULL,
    created_at   TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP
);