-- ========== 6. TAREFAS - VERSÃO COMPLETA ==========
INSERT INTO tasks (task_group_id, creator_id, assignee_id, title, description, priority, position, due_date) VALUES
-- Front-end - To Do
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Front-end' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    'Implementar layout responsivo',
    'Criar layout responsivo para mobile, tablet e desktop usando CSS Grid e Flexbox',
    'HIGH',
    1,
    NOW() + INTERVAL '5 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Front-end' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    'Validação de formulários',
    'Adicionar validação client-side com JavaScript e feedback visual para usuário',
    'MEDIUM',
    2,
    NOW() + INTERVAL '7 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Front-end' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    NULL,
    'Implementar theme escuro',
    'Adicionar toggle para tema claro/escuro com persistência em localStorage',
    'LOW',
    3,
    NOW() + INTERVAL '10 days'
),
-- Front-end - In Progress
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Front-end' AND tg.name = 'In Progress'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    'Componentizar navegação',
    'Criar componentes React reutilizáveis para header, sidebar e footer',
    'MEDIUM',
    1,
    NOW() + INTERVAL '3 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Front-end' AND tg.name = 'In Progress'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    'Integração com API REST',
    'Conectar frontend com backends usando fetch/axios e gerenciar estados',
    'HIGH',
    2,
    NOW() + INTERVAL '4 days'
),
-- Front-end - Done
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Front-end' AND tg.name = 'Done'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    'Setup inicial do projeto',
    'Configurar webpack, babel, eslint e dependências iniciais',
    'HIGH',
    1,
    NOW() - INTERVAL '10 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Front-end' AND tg.name = 'Done'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    'Configurar Prettier e ESLint',
    'Setup de formatação automática e linting',
    'MEDIUM',
    2,
    NOW() - INTERVAL '8 days'
),
-- Back-end - To Do
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Back-end' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    'Criar endpoints de autenticação',
    'Implementar POST /auth/login, POST /auth/register, POST /auth/refresh-token',
    'HIGH',
    1,
    NOW() + INTERVAL '3 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Back-end' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    'Criar CRUD de projetos',
    'Implementar GET, POST, PUT, DELETE /projects com validações',
    'HIGH',
    2,
    NOW() + INTERVAL '5 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Back-end' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    NULL,
    'Implementar cache com Redis',
    'Adicionar camada de cache para consultas frequentes de projetos e tasks',
    'LOW',
    3,
    NOW() + INTERVAL '14 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Back-end' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    NULL,
    'Documentar API com Swagger',
    'Gerar documentação interativa da API usando Swagger/OpenAPI',
    'MEDIUM',
    4,
    NOW() + INTERVAL '10 days'
),
-- Back-end - In Progress
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Back-end' AND tg.name = 'In Progress'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    'Criar CRUD de tarefas',
    'Implementar endpoints para gerenciar tasks e subtasks',
    'HIGH',
    1,
    NOW() + INTERVAL '2 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Back-end' AND tg.name = 'In Progress'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    'Implementar repositório de usuários',
    'Criar camada de persistência com Spring Data JPA',
    'MEDIUM',
    2,
    NOW() + INTERVAL '1 day'
),
-- Back-end - Done
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Back-end' AND tg.name = 'Done'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    'Setup banco de dados PostgreSQL',
    'Configurar PostgreSQL, criar schema e migrations iniciais',
    'HIGH',
    1,
    NOW() - INTERVAL '15 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Back-end' AND tg.name = 'Done'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    'Configurar Spring Boot',
    'Setup inicial do projeto com dependências essenciais',
    'HIGH',
    2,
    NOW() - INTERVAL '12 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Back-end' AND tg.name = 'Done'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    'Configurar segurança JWT',
    'Implementar autenticação baseada em JWT tokens',
    'HIGH',
    3,
    NOW() - INTERVAL '7 days'
),
-- Design - To Do
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Design' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    (SELECT id FROM users WHERE username = 'ana_costa'),
    'Criar paleta de cores',
    'Definir paleta de cores principal, secundária e de feedback no Figma',
    'MEDIUM',
    1,
    NOW() + INTERVAL '2 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Design' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    (SELECT id FROM users WHERE username = 'ana_costa'),
    'Definir guia de tipografia',
    'Selecionar fontes e tamanhos padrão para diferentes elementos',
    'MEDIUM',
    2,
    NOW() + INTERVAL '3 days'
),
-- Design - Done
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Design' AND tg.name = 'Done'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    'Prototipagem em Figma',
    'Criar wireframes e protótipos interativos no Figma',
    'HIGH',
    1,
    NOW() - INTERVAL '5 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Design' AND tg.name = 'Done'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    'Criar design system',
    'Documentar componentes reutilizáveis e padrões de design',
    'HIGH',
    2,
    NOW() - INTERVAL '3 days'
),
-- Desenvolvimento - To Do
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Desenvolvimento' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    NULL,
    'Análise de requisitos',
    'Revisar e detalhar todos os requisitos funcionais e não-funcionais',
    'MEDIUM',
    1,
    NOW() + INTERVAL '1 day'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Desenvolvimento' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    (SELECT id FROM users WHERE username = 'ana_costa'),
    'Planejamento de sprints',
    'Definir backlog, épicos e sprints para o projeto',
    'HIGH',
    2,
    NOW() + INTERVAL '2 days'
),
-- Desenvolvimento - In Progress
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Desenvolvimento' AND tg.name = 'In Progress'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    'Testes unitários - Backend',
    'Implementar testes para camadas de service e repository',
    'MEDIUM',
    1,
    NOW() + INTERVAL '4 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Desenvolvimento' AND tg.name = 'In Progress'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    'Testes de integração',
    'Testes E2E com Postman e testes de integração com testcontainers',
    'MEDIUM',
    2,
    NOW() + INTERVAL '5 days'
),
-- Desenvolvimento - Done
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Desenvolvimento' AND tg.name = 'Done'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    (SELECT id FROM users WHERE username = 'maria_santos'),
    'Setup do repositório Git',
    'Criar repositório, configurar branches e políticas de merge',
    'HIGH',
    1,
    NOW() - INTERVAL '20 days'
),
-- Análise - To Do
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Análise' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    (SELECT id FROM users WHERE username = 'joao_silva'),
    'Revisar performance do banco',
    'Analisar queries lentas e criar índices se necessário',
    'MEDIUM',
    1,
    NOW() + INTERVAL '5 days'
),
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Análise' AND tg.name = 'To Do'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    NULL,
    'Audit de segurança',
    'Revisar vulnerabilidades e dependências do projeto',
    'HIGH',
    2,
    NOW() + INTERVAL '7 days'
),
-- Análise - In Progress
(
    (SELECT tg.id FROM task_groups tg JOIN boards b ON tg.board_id = b.id WHERE b.name = 'Análise' AND tg.name = 'In Progress'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    (SELECT id FROM users WHERE username = 'carlos_oliveira'),
    'Refatorar código duplicado',
    'Extrair lógica comum em métodos/classes reutilizáveis',
    'MEDIUM',
    1,
    NOW() + INTERVAL '3 days'
);

-- ========== 7. SUBTAREFAS - VERSÃO COMPLETA ==========
INSERT INTO subtasks (task_id, description, is_completed, position) VALUES
-- Subtarefas: "Implementar layout responsivo"
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Implementar layout responsivo' LIMIT 1),
    'Criar media queries para mobile (max-width: 480px)',
    TRUE,
    1
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Implementar layout responsivo' LIMIT 1),
    'Criar media queries para tablet (480px - 1024px)',
    TRUE,
    2
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Implementar layout responsivo' LIMIT 1),
    'Criar media queries para desktop (min-width: 1024px)',
    FALSE,
    3
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Implementar layout responsivo' LIMIT 1),
    'Testar em navegadores reais (Chrome, Firefox, Safari, Edge)',
    FALSE,
    4
),
-- Subtarefas: "Validação de formulários"
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Validação de formulários' LIMIT 1),
    'Validar formato de email com regex',
    TRUE,
    1
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Validação de formulários' LIMIT 1),
    'Validar senha (mínimo 8 caracteres, maiúscula, número)',
    FALSE,
    2
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Validação de formulários' LIMIT 1),
    'Implementar feedback visual (cores e ícones)',
    FALSE,
    3
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Validação de formulários' LIMIT 1),
    'Testar validação com dados inválidos',
    FALSE,
    4
),
-- Subtarefas: "Criar endpoints de autenticação"
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar endpoints de autenticação' LIMIT 1),
    'Implementar endpoint POST /auth/register com validações',
    FALSE,
    1
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar endpoints de autenticação' LIMIT 1),
    'Implementar endpoint POST /auth/login com geração de token',
    FALSE,
    2
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar endpoints de autenticação' LIMIT 1),
    'Implementar endpoint POST /auth/refresh-token',
    FALSE,
    3
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar endpoints de autenticação' LIMIT 1),
    'Testar endpoints com Postman/Insomnia',
    FALSE,
    4
),
-- Subtarefas: "Criar CRUD de projetos"
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar CRUD de projetos' LIMIT 1),
    'Implementar GET /projects (listar todos)',
    FALSE,
    1
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar CRUD de projetos' LIMIT 1),
    'Implementar GET /projects/{id} (obter um projeto)',
    FALSE,
    2
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar CRUD de projetos' LIMIT 1),
    'Implementar POST /projects (criar novo projeto)',
    FALSE,
    3
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar CRUD de projetos' LIMIT 1),
    'Implementar PUT /projects/{id} (atualizar projeto)',
    FALSE,
    4
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar CRUD de projetos' LIMIT 1),
    'Implementar DELETE /projects/{id} (deletar projeto)',
    FALSE,
    5
),
-- Subtarefas: "Criar CRUD de tarefas"
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar CRUD de tarefas' LIMIT 1),
    'Implementar GET /tasks (listar com filtros)',
    FALSE,
    1
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar CRUD de tarefas' LIMIT 1),
    'Implementar POST /tasks (criar nova tarefa)',
    FALSE,
    2
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar CRUD de tarefas' LIMIT 1),
    'Implementar PUT /tasks/{id} (atualizar tarefa)',
    FALSE,
    3
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar CRUD de tarefas' LIMIT 1),
    'Implementar DELETE /tasks/{id} (deletar tarefa)',
    FALSE,
    4
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar CRUD de tarefas' LIMIT 1),
    'Implementar reordenação de tarefas (PATCH)',
    FALSE,
    5
),
-- Subtarefas: "Testes unitários - Backend"
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Testes unitários - Backend' LIMIT 1),
    'Criar testes para UserService',
    FALSE,
    1
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Testes unitários - Backend' LIMIT 1),
    'Criar testes para ProjectService',
    FALSE,
    2
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Testes unitários - Backend' LIMIT 1),
    'Criar testes para TaskService',
    FALSE,
    3
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Testes unitários - Backend' LIMIT 1),
    'Atingir cobertura mínima de 80%',
    FALSE,
    4
),
-- Subtarefas: "Testes de integração"
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Testes de integração' LIMIT 1),
    'Criar testes E2E para fluxo de autenticação',
    FALSE,
    1
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Testes de integração' LIMIT 1),
    'Criar testes E2E para CRUD de projetos',
    FALSE,
    2
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Testes de integração' LIMIT 1),
    'Criar testes com testcontainers (PostgreSQL)',
    FALSE,
    3
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Testes de integração' LIMIT 1),
    'Documentar como executar os testes',
    FALSE,
    4
),
-- Subtarefas: "Criar paleta de cores"
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar paleta de cores' LIMIT 1),
    'Selecionar cor primária e variações',
    FALSE,
    1
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar paleta de cores' LIMIT 1),
    'Selecionar cores secundárias',
    FALSE,
    2
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar paleta de cores' LIMIT 1),
    'Definir cores de feedback (sucesso, erro, aviso, info)',
    FALSE,
    3
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Criar paleta de cores' LIMIT 1),
    'Testar contraste WCAG AA',
    FALSE,
    4
),
-- Subtarefas: "Revisar performance do banco"
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Revisar performance do banco' LIMIT 1),
    'Analisar query plans das queries lentas',
    FALSE,
    1
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Revisar performance do banco' LIMIT 1),
    'Criar índices nas colunas mais consultadas',
    FALSE,
    2
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Revisar performance do banco' LIMIT 1),
    'Otimizar N+1 queries com JOIN e eager loading',
    FALSE,
    3
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Revisar performance do banco' LIMIT 1),
    'Documentar índices criados e melhorias',
    FALSE,
    4
),
-- Subtarefas: "Audit de segurança"
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Audit de segurança' LIMIT 1),
    'Verificar vulnerabilidades com OWASP Top 10',
    FALSE,
    1
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Audit de segurança' LIMIT 1),
    'Revisar dependências com npm audit / mvn dependency-check',
    FALSE,
    2
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Audit de segurança' LIMIT 1),
    'Testar SQL injection e XSS',
    FALSE,
    3
),
(
    (SELECT t.id FROM tasks t WHERE t.title = 'Audit de segurança' LIMIT 1),
    'Gerar relatório com findings e remediações',
    FALSE,
    4
);