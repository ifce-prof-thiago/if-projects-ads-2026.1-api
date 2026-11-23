# Integração com o frontend

Use a URL base configurada no ambiente do frontend, por exemplo `http://localhost:8080`.
Todos os endpoints protegidos usam o header abaixo; `X-User-Id` não é aceito como autenticação.

```http
Authorization: Bearer <accessToken>
Content-Type: application/json
```

## Autenticação

`POST /api/v1/auth/login`

```json
{
  "email": "ana@example.com",
  "password": "senha-segura"
}
```

Resposta `200 OK`:

```json
{
  "id": "b6d09472-9a75-4b02-91f7-e7df2ad293e3",
  "username": "ana",
  "email": "ana@example.com",
  "accessToken": "eyJhbGciOiJIUzI1NiJ9...",
  "tokenType": "Bearer",
  "expiresIn": 86400,
  "refreshToken": "fP8Q..."
}
```

Envie o `accessToken` em todas as chamadas protegidas. Quando ele expirar, envie o `refreshToken` para `POST /api/v1/auth/refresh`; o token de refresh é de uso único e a resposta traz um novo par de tokens. O endpoint legado `POST /api/v1/users/login` continua disponível temporariamente, mas novos clientes devem usar `/api/v1/auth/login`.

```json
{ "refreshToken": "fP8Q..." }
```

## Rotas normalizadas

| Recurso | Base |
| --- | --- |
| Usuários | `/api/v1/users` |
| Projetos | `/api/v1/projects` |
| Quadros | `/api/v1/boards` |
| Grupos de tarefas | `/api/v1/task-groups` |
| Tarefas | `/api/v1/tasks` |
| Subtarefas | `/api/v1/subtasks` |

As IDs de usuários, projetos, quadros, grupos, tarefas e subtarefas são UUIDs.

## Subtarefas

Criação: `POST /api/v1/subtasks`

```json
{
  "taskId": "dc5fd837-2e7c-47b5-afb1-c9e1fba02ec6",
  "description": "Revisar integração",
  "position": 0
}
```

Listagem: `GET /api/v1/subtasks/task-groups/{taskId}`. A resposta sempre é uma lista JSON, inclusive quando vazia.

Atualização de texto: `PATCH /api/v1/subtasks/{subtaskId}/description`

```json
{ "description": "Descrição atualizada" }
```

Atualização de conclusão: `PATCH /api/v1/subtasks/{subtaskId}/completion`

```json
{ "completed": true }
```

Para alternar o status sem enviar corpo, use `PATCH /api/v1/subtasks/{subtaskId}/toggle`. Para converter em tarefa, envie `POST /api/v1/subtasks/conversion`:

```json
{
  "subtaskId": "dc5fd837-2e7c-47b5-afb1-c9e1fba02ec6",
  "title": "Nova tarefa",
  "description": "Detalhes da tarefa",
  "priority": "MEDIUM",
  "dueDate": "2026-12-10T17:00:00-03:00"
}
```

## Erros

Erros usam um formato único:

```json
{
  "status": 400,
  "error": "Bad Request",
  "message": "Dados inválidos",
  "timestamp": "2026-11-22T20:00:00Z",
  "fields": { "email": "Informe um e-mail válido" }
}
```

## CORS e ambientes

Em desenvolvimento, Vite (`5173`) e servidores locais (`3000`) já são permitidos. Para outro frontend, configure a variável de ambiente `CORS_ALLOWED_ORIGINS` como uma lista separada por vírgula. Em produção, configure também `JWT_SECRET` com uma chave forte e exclusiva.
