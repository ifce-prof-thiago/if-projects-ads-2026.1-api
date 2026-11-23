package estudo;

/**
 * ARQUIVO SÓ PARA ESTUDO — não faz parte da API e não é compilado.
 *
 * Adições: 929 linhas  (diff rastreado 308 + arquivos novos 621)
 * Remoções: 300 linhas
 *
 * Como ler:
 *  1) PARTE A = o que saiu (handlers antigos, filtros, JSON {error:...}, etc.)
 *  2) PARTE B = o que entrou no lugar (ApiException, JWT, exceções por equipe)
 *  3) PARTE C = arquivos .java / yaml / gradle novos por completo
 */
public final class EstudoAdicoesERemocoesApi {
    private EstudoAdicoesERemocoesApi() {}
}

// =============================================================================
// PARTE A — LINHAS REMOVIDAS (300)
// =============================================================================

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/application/controllers/SubtarefaController.java (2 linhas) -----
// -     public ResponseEntity<Void> criar(@RequestBody SubtarefaDTOinput input){
// -         return ResponseEntity.ok().build();

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/infra/repositories/SubtarefaRepository.java (4 linhas) -----
// -         jdbcTemplate.update(sql, novoTexto, id);
// -         jdbcTemplate.update(sql, novoStatus, id);
// -         jdbcTemplate.update(sql, novaPosicao, id);
// -         jdbcTemplate.update(sql, id);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/model/SubtarefaDTOinput.java (1 linhas) -----
// - import java.time.OffsetDateTime;

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/ProjectExceptionHandler.java (63 linhas) -----
// - package br.edu.ifce.mn.ads.ifproject._commons;
// - 
// - import br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions.*;
// - import org.springframework.http.HttpStatus;
// - import org.springframework.http.ResponseEntity;
// - import org.springframework.web.bind.annotation.ExceptionHandler;
// - import org.springframework.web.bind.annotation.RestControllerAdvice;
// - 
// - import java.time.LocalDateTime;
// - import java.util.Map;
// - 
// - @RestControllerAdvice
// - public class ProjectExceptionHandler {
// - 
// -     @ExceptionHandler(ProjectNotFoundException.class)
// -     public ResponseEntity<Map<String, Object>> handle(ProjectNotFoundException ex) {
// -         return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(MemberNotFoundException.class)
// -     public ResponseEntity<Map<String, Object>> handle(MemberNotFoundException ex) {
// -         return buildResponse(HttpStatus.NOT_FOUND, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(ProjectAlreadyArchivedException.class)
// -     public ResponseEntity<Map<String, Object>> handle(ProjectAlreadyArchivedException ex) {
// -         return buildResponse(HttpStatus.CONFLICT, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(ProjectNotArchivedException.class)
// -     public ResponseEntity<Map<String, Object>> handle(ProjectNotArchivedException ex) {
// -         return buildResponse(HttpStatus.CONFLICT, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(MemberAlreadyExistsException.class)
// -     public ResponseEntity<Map<String, Object>> handle(MemberAlreadyExistsException ex) {
// -         return buildResponse(HttpStatus.CONFLICT, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(CannotRemoveOwnerException.class)
// -     public ResponseEntity<Map<String, Object>> handle(CannotRemoveOwnerException ex) {
// -         return buildResponse(HttpStatus.UNPROCESSABLE_ENTITY, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(CannotTransferToNonMemberException.class)
// -     public ResponseEntity<Map<String, Object>> handle(CannotTransferToNonMemberException ex) {
// -         return buildResponse(HttpStatus.UNPROCESSABLE_ENTITY, ex.getMessage());
// -     }
// - 
// -     @ExceptionHandler(InsufficientPermissionException.class)
// -     public ResponseEntity<Map<String, Object>> handle(InsufficientPermissionException ex) {
// -         return buildResponse(HttpStatus.FORBIDDEN, ex.getMessage());
// -     }
// - 
// -     private ResponseEntity<Map<String, Object>> buildResponse(HttpStatus status, String message) {
// -         return ResponseEntity.status(status).body(Map.of(
// -                 "status", status.value(),
// -                 "error", status.getReasonPhrase(),
// -                 "message", message,
// -                 "timestamp", LocalDateTime.now().toString()
// -         ));
// -     }
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/TenantFilter.java (27 linhas) -----
// - package br.edu.ifce.mn.ads.ifproject._commons;
// - 
// - import jakarta.servlet.FilterChain;
// - import jakarta.servlet.ServletException;
// - import jakarta.servlet.http.HttpServletRequest;
// - import jakarta.servlet.http.HttpServletResponse;
// - import org.jspecify.annotations.NonNull;
// - import org.springframework.stereotype.Component;
// - import org.springframework.web.filter.OncePerRequestFilter;
// - 
// - import java.io.IOException;
// - 
// - @Component
// - public class TenantFilter extends OncePerRequestFilter {
// - 
// -     @Override
// -     protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain) {
// -         final var userId = request.getHeader("X-User-Id");
// -         ScopedValue.where(UserLogged.USER_ID, userId).run(() -> {
// -             try {
// -                 filterChain.doFilter(request, response);
// -             } catch (ServletException | IOException ex) {
// -                 throw new RuntimeException(ex);
// -             }
// -         });
// -     }
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/UserLogged.java (1 linhas) -----
// -             throw new RuntimeException("Usuário não autenticado");

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/UserLoggedFilter.java (44 linhas) -----
// - package br.edu.ifce.mn.ads.ifproject._commons;
// - 
// - import jakarta.servlet.FilterChain;
// - import jakarta.servlet.ServletException;
// - import jakarta.servlet.http.HttpServletRequest;
// - import jakarta.servlet.http.HttpServletResponse;
// - import org.springframework.stereotype.Component;
// - import org.springframework.web.filter.OncePerRequestFilter;
// - 
// - import java.io.IOException;
// - 
// - @Component
// - public class UserLoggedFilter extends OncePerRequestFilter {
// - 
// -     @Override
// -     protected void doFilterInternal(
// -             HttpServletRequest request,
// -             HttpServletResponse response,
// -             FilterChain filterChain
// -     ) throws ServletException, IOException {
// - 
// -         final var userId = request.getHeader("X-User-Id");
// - 
// -         if (userId != null && !userId.isBlank()) {
// -             try {
// -                 ScopedValue.where(UserLogged.USER_ID, userId)
// -                         .run(() -> {
// -                             try {
// -                                 filterChain.doFilter(request, response);
// -                             } catch (IOException | ServletException e) {
// -                                 throw new RuntimeException(e);
// -                             }
// -                         });
// -             } catch (RuntimeException e) {
// -                 Throwable cause = e.getCause();
// -                 if (cause instanceof IOException ioException) throw ioException;
// -                 if (cause instanceof ServletException servletException) throw servletException;
// -                 throw new ServletException(e);
// -             }
// -         } else {
// -             filterChain.doFilter(request, response);
// -         }
// -     }
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/application/controllers/BoardController.java (8 linhas) -----
// - import br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive.IArchiveBoard;
// -     public void delete(
// -             @PathVariable UUID id,
// -             @RequestHeader("X-User-Id") UUID requesterId
// -     ) {
// -         deleteBoard.execute(id, requesterId);
// -             @RequestHeader("X-User-Id") UUID requesterId,
// -                 requesterId

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/delete/DeleteBoard.java (5 linhas) -----
// -         boolean isAuthorized = repository.isUserAuthorizedToDelete(boardId, userId);
// - 
// -         if(!isAuthorized){
// -             throw new RuntimeException("User is not authorized to delete this board.");
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/duplicate/DuplicateBoard.java (1 linhas) -----
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/read/ReadBoard.java (4 linhas) -----
// - 
// -         final var board = repository.find(input);
// - 
// -         return board;

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/update/IUpdateBoard.java (1 linhas) -----
// -             @Size(min = 3, max = 30)

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/application/controllers/ProjectController.java (6 linhas) -----
// -     //@RequestHeader("X-User-Id") → Spring Security (futuro)
// -     //@RequestHeader("X-User-Id") → Spring Security (futuro)
// -     //@RequestHeader("X-User-Id") → Spring Security (futuro)
// -     public List<IListArchivedProjects.IListArchivedProjectsOutput> get(@RequestParam UUID userId, Pageable pageable) {
// -         var input = new IListArchivedProjects.ListArchivedProjectsInput(userId, pageable);
// -         return listArchivedProjects.execute(input, pageable);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/CannotRemoveOwnerException.java (3 linhas) -----
// - public class CannotRemoveOwnerException extends RuntimeException {
// -     public CannotRemoveOwnerException() {
// -         super("Cannot remove the owner from the project", null, true, false);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/CannotTransferToNonMemberException.java (3 linhas) -----
// - public class CannotTransferToNonMemberException extends RuntimeException {
// -         super("Cannot transfer ownership to a non-member: " + userId, null, true, false);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/InsufficientPermissionException.java (4 linhas) -----
// - public class InsufficientPermissionException extends RuntimeException {
// -     public InsufficientPermissionException() {
// -         super("Insufficient permission to perform this action", null, false, false);
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/MemberAlreadyExistsException.java (3 linhas) -----
// - public class MemberAlreadyExistsException extends RuntimeException {
// -         super("Member " + userId + " already exists in project " + projectId, null, true, false);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/MemberNotFoundException.java (3 linhas) -----
// - public class MemberNotFoundException extends RuntimeException {
// -         super("Member not found in project: " + userId, null, true, false);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectAlreadyArchivedException.java (3 linhas) -----
// - public class ProjectAlreadyArchivedException extends RuntimeException {
// -         super("Project is already archived: " + id, null, true, false);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectNotArchivedException.java (3 linhas) -----
// - public class ProjectNotArchivedException extends RuntimeException {
// -         super("Project is not archived: " + id, null, true, false);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectNotFoundException.java (4 linhas) -----
// - public class ProjectNotFoundException extends RuntimeException {
// -         super("Project not found: " + id, null, true, false);
// - 
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/models/ProjectName.java (1 linhas) -----
// - @Size(min = 3, max = 100)

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_archived_projects/IListArchivedProjects.java (1 linhas) -----
// -     List<IListArchivedProjectsOutput> execute(ListArchivedProjectsInput input, Pageable pageable);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_archived_projects/ListArchivedProjects.java (1 linhas) -----
// -     public List<IListArchivedProjectsOutput> execute(ListArchivedProjectsInput input, Pageable pageable) {

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/application/exceptions/GlobalExceptionHandler.java (64 linhas) -----
// - package br.edu.ifce.mn.ads.ifproject.subtasks.application.exceptions;
// - 
// - import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.BusinessRuleException;
// - import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
// - import org.springframework.http.HttpStatus;
// - import org.springframework.http.converter.HttpMessageNotReadableException;
// - import org.springframework.validation.FieldError;
// - import org.springframework.web.bind.MethodArgumentNotValidException;
// - import org.springframework.web.bind.annotation.ExceptionHandler;
// - import org.springframework.web.bind.annotation.ResponseStatus;
// - import org.springframework.web.bind.annotation.RestControllerAdvice;
// - import tools.jackson.databind.exc.InvalidFormatException;
// - 
// - import java.util.HashMap;
// - import java.util.List;
// - import java.util.Map;
// - 
// - @RestControllerAdvice
// - public class GlobalExceptionHandler {
// - 
// -     @ResponseStatus(HttpStatus.BAD_REQUEST)
// -     @ExceptionHandler(MethodArgumentNotValidException.class)
// -     public static Map<String, String> globalExceptions(MethodArgumentNotValidException ex) {
// -         Map<String, String> errors = new HashMap<>();
// - 
// -         ex.getBindingResult().getAllErrors().forEach((error) -> {
// -             String field = ((FieldError) error).getField();
// -             String errorMessage = error.getDefaultMessage();
// - 
// -             errors.put(field, errorMessage);
// -         });
// - 
// -         return errors;
// -     }
// - 
// -     @ResponseStatus(HttpStatus.NOT_FOUND)
// -     @ExceptionHandler(ResourceNotFoundException.class)
// -     public static Map<String, String> globalExceptions(ResourceNotFoundException ex) {
// -         return Map.of("error", ex.getMessage());
// -     }
// - 
// -     @ResponseStatus(HttpStatus.BAD_REQUEST)
// -     @ExceptionHandler(BusinessRuleException.class)
// -     public static Map<String, String> globalExceptions(BusinessRuleException ex) {
// -         return Map.of("error", ex.getMessage());
// -     }
// - 
// -     @ResponseStatus(HttpStatus.BAD_REQUEST)
// -     @ExceptionHandler(HttpMessageNotReadableException.class)
// -     public static Map<String, String> globalExceptions(HttpMessageNotReadableException ex) {
// - 
// -         Throwable cause = ex.getCause();
// - 
// -         if(cause instanceof InvalidFormatException invalidFormat){
// - 
// -             if(invalidFormat.getTargetType().isEnum() && invalidFormat.getPath().getFirst().getPropertyName().equals("priority")){
// -                 return Map.of("error", "Valor inválido para priority");
// -             }
// -         }
// - 
// -         return Map.of("error", "Valor inválido");
// - 
// -     }
// - }

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/exceptions/BusinessRuleException.java (2 linhas) -----
// - public class BusinessRuleException extends RuntimeException {
// -         super(message);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/exceptions/ResourceNotFoundException.java (3 linhas) -----
// - public class ResourceNotFoundException extends RuntimeException {
// -         super(message);
// - 

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usecases/commands/toggle/ToggleSubtask.java (2 linhas) -----
// -         final var result = repository.toggle(id);
// -         return new ToggleSubtaskOutput(result.id(), result.isCompleted());

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usercases/commands/conversion/ConversionSubTasks.java (2 linhas) -----
// -                 .orElseThrow(() -> new ResourceNotFoundException("Subtask not found"));
// -             throw new BusinessRuleException("Subtask já está completada");

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/activate/ActivateTask.java (1 linhas) -----
// -             throw new RuntimeException("Task not found");

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/archived/ArchivedTask.java (1 linhas) -----
// -             throw new RuntimeException("Task not found");

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/update/UpdateTask.java (1 linhas) -----
// -                 .orElseThrow(()->new RuntimeException("Task not found"));

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/archive/ArchiveTask.java (2 linhas) -----
// -         final var taskId = repository.persist(id);
// -         return null;

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/create/ICreateColumn.java (1 linhas) -----
// -     CreateColumnOutput execute(CreateColumnInput input);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/delete/DeleteColumn.java (2 linhas) -----
// - import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate.IActivateUser;
// - import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/move/IMoveColumn.java (1 linhas) -----
// -     MoveColumnOutput execute(UUID id, MoveColumnInput input);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/update/IRenameColumn.java (1 linhas) -----
// -     RenameColumnOutput execute(UUID id, RenameColumnInput input);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/models/Password.java (1 linhas) -----
// - @Size(min = 4, max = 8)

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/models/Username.java (1 linhas) -----
// - @Size(min = 3, max = 10)

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/create/ICreateUser.java (1 linhas) -----
// -             @Email String email,

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update/IUpdateUser.java (1 linhas) -----
// -             @Email String email

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update_password/UpdateUserPassword.java (2 linhas) -----
// -         final var userId = repository.persist(id, input);
// -         return new UpdateUserPasswordOutput(userId);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/IUserRepository.java (1 linhas) -----
// -     Long persist(Long id, IUpdateUserPassword.UpdateUserPasswordInput input);

// ----- REMOVIDO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/UserRepository.java (4 linhas) -----
// -     public Long persist(Long id, IUpdateUserPassword.UpdateUserPasswordInput input) {
// -         db.sql(SQL)
// - 
// -         return id;

// ----- REMOVIDO em src/main/resources/application.yaml (2 linhas) -----
// -     url: jdbc:postgresql://localhost:5432/postgres
// -     password: postgres

// ----- REMOVIDO em src/main/resources/schema.sql (8 linhas) -----
// - CREATE TABLE users
// - CREATE TABLE projects
// - CREATE TABLE project_members
// - CREATE TABLE boards
// - CREATE TABLE task_groups
// - CREATE TABLE tasks
// - CREATE TABLE subtasks
// - );

// =============================================================================
// PARTE B — LINHAS ADICIONADAS EM ARQUIVOS JÁ EXISTENTES (308)
// =============================================================================

// ----- ADICIONADO em build.gradle (5 linhas) -----
// +     implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:3.0.3'
// +     implementation 'org.springframework.boot:spring-boot-starter-security'
// +     implementation 'io.jsonwebtoken:jjwt-api:0.12.6'
// +     runtimeOnly 'io.jsonwebtoken:jjwt-impl:0.12.6'
// +     runtimeOnly 'io.jsonwebtoken:jjwt-jackson:0.12.6'

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/application/controllers/SubtarefaController.java (3 linhas) -----
// + import jakarta.validation.Valid;
// +     public ResponseEntity<Void> criar(@RequestBody @Valid SubtarefaDTOinput input){
// +         return ResponseEntity.ok(lista);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/infra/repositories/SubtarefaRepository.java (13 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
// +         if (jdbcTemplate.update(sql, novoTexto, id) == 0) {
// +             throw new ResourceNotFoundException("Subtarefa não encontrada");
// +         }
// +         if (jdbcTemplate.update(sql, novoStatus, id) == 0) {
// +             throw new ResourceNotFoundException("Subtarefa não encontrada");
// +         }
// +         if (jdbcTemplate.update(sql, novaPosicao, id) == 0) {
// +             throw new ResourceNotFoundException("Subtarefa não encontrada");
// +         }
// +         if (jdbcTemplate.update(sql, id) == 0) {
// +             throw new ResourceNotFoundException("Subtarefa não encontrada");
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/Subtasks/model/SubtarefaDTOinput.java (20 linhas) -----
// + import jakarta.validation.constraints.NotBlank;
// + import jakarta.validation.constraints.NotNull;
// + 
// +     @NotNull(message = "A tarefa é obrigatória")
// +     @NotBlank(message = "O texto da subtarefa é obrigatório")
// +     public SubtarefaDTOinput() {
// +     }
// + 
// + 
// +     public void setTaskID(UUID taskID) {
// +         this.taskID = taskID;
// +     }
// + 
// +     public void setTexto(String texto) {
// +         this.texto = texto;
// +     }
// + 
// +     public void setPosicao(Integer posicao) {
// +         this.posicao = posicao;
// +     }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/UserLogged.java (1 linhas) -----
// +             throw new UnauthenticatedException();

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/application/controllers/BoardController.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
// +     public void delete(@PathVariable UUID id) {
// +         deleteBoard.execute(id, UserLogged.id());
// +                 UserLogged.id()

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/infra/repositories/BoardRepository.java (8 linhas) -----
// +     @Override
// +     public boolean exists(UUID id) {
// +         return db.sql("SELECT EXISTS(SELECT 1 FROM boards WHERE id = ?)")
// +                 .param(id)
// +                 .query(Boolean.class)
// +                 .single();
// +     }
// + 

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/infra/repositories/IBoardRepository.java (2 linhas) -----
// +     boolean exists(UUID id);
// + 

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/delete/DeleteBoard.java (7 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
// + import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardUnauthorizedException;
// +         if (!repository.exists(boardId)) {
// +             throw new BoardNotFoundException();
// +         }
// +         if (!repository.isUserAuthorizedToDelete(boardId, userId)) {
// +             throw new BoardUnauthorizedException();

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/duplicate/DuplicateBoard.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
// +         if (!repository.exists(input.originalBoardId())) {
// +             throw new BoardNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/read/ReadBoard.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
// +         if (!repository.exists(input.id())) {
// +             throw new BoardNotFoundException();
// +         }
// +         return repository.find(input);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/update/IUpdateBoard.java (1 linhas) -----
// +             @Size(min = 3, max = 30, message = "O nome do quadro deve ter entre 3 e 30 caracteres")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/usecases/commands/update/UpdateBoard.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions.BoardNotFoundException;
// +         if (!repository.exists(id)) {
// +             throw new BoardNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/application/controllers/ProjectController.java (2 linhas) -----
// +     public List<IListArchivedProjects.IListArchivedProjectsOutput> getArchived(Pageable pageable) {
// +         return listArchivedProjects.execute(pageable);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/CannotRemoveOwnerException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + public class CannotRemoveOwnerException extends ApiException {
// +     public CannotRemoveOwnerException() {
// +         super(HttpStatus.UNPROCESSABLE_ENTITY, "Não é possível remover o dono do projeto");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/CannotTransferToNonMemberException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class CannotTransferToNonMemberException extends ApiException {
// +         super(HttpStatus.UNPROCESSABLE_ENTITY, "Só é possível transferir o projeto para um membro");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/InsufficientPermissionException.java (6 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + public class InsufficientPermissionException extends ApiException {
// +     public InsufficientPermissionException() {
// +         super(HttpStatus.FORBIDDEN, "Você não tem permissão para realizar esta ação");
// + }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/MemberAlreadyExistsException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class MemberAlreadyExistsException extends ApiException {
// +         super(HttpStatus.CONFLICT, "Este membro já está no projeto");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/MemberNotFoundException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class MemberNotFoundException extends ApiException {
// +         super(HttpStatus.NOT_FOUND, "Membro não encontrado neste projeto");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectAlreadyArchivedException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class ProjectAlreadyArchivedException extends ApiException {
// +         super(HttpStatus.CONFLICT, "Este projeto já está arquivado");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectNotArchivedException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class ProjectNotArchivedException extends ApiException {
// +         super(HttpStatus.CONFLICT, "Este projeto não está arquivado");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/exceptions/ProjectNotFoundException.java (6 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class ProjectNotFoundException extends ApiException {
// +         super(HttpStatus.NOT_FOUND, "Projeto não encontrado");
// + }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/models/ProjectName.java (1 linhas) -----
// + @Size(min = 3, max = 100, message = "O nome do projeto deve ter entre 3 e 100 caracteres")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_archived_projects/IListArchivedProjects.java (1 linhas) -----
// +     List<IListArchivedProjectsOutput> execute(Pageable pageable);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/projects/domain/usecases/queries/list_archived_projects/ListArchivedProjects.java (3 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
// +     public List<IListArchivedProjectsOutput> execute(Pageable pageable) {
// +         var input = new ListArchivedProjectsInput(UserLogged.id(), pageable);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/exceptions/BusinessRuleException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class BusinessRuleException extends ApiException {
// +         super(HttpStatus.UNPROCESSABLE_ENTITY, message);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/exceptions/ResourceNotFoundException.java (5 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class ResourceNotFoundException extends ApiException {
// +         super(HttpStatus.NOT_FOUND, message);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usecases/commands/toggle/ToggleSubtask.java (8 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.subtasks.domain.exceptions.ResourceNotFoundException;
// + import org.springframework.dao.EmptyResultDataAccessException;
// +         try {
// +             final var result = repository.toggle(id);
// +             return new ToggleSubtaskOutput(result.id(), result.isCompleted());
// +         } catch (EmptyResultDataAccessException ex) {
// +             throw new ResourceNotFoundException("Subtarefa não encontrada");
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/subtasks/domain/usercases/commands/conversion/ConversionSubTasks.java (2 linhas) -----
// +                 .orElseThrow(() -> new ResourceNotFoundException("Subtarefa não encontrada"));
// +             throw new BusinessRuleException("Não é possível converter uma subtarefa já concluída");

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/activate/ActivateTask.java (2 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task.domain.exceptions.TaskNotFoundException;
// +             throw new TaskNotFoundException();

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/archived/ArchivedTask.java (2 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task.domain.exceptions.TaskNotFoundException;
// +             throw new TaskNotFoundException();

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/usecase/update/UpdateTask.java (2 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task.domain.exceptions.TaskNotFoundException;
// +                 .orElseThrow(TaskNotFoundException::new);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/archive/ArchiveTask.java (6 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
// +         if (!repository.exists(id)) {
// +             throw new ColumnNotFoundException();
// +         }
// +         repository.persist(id);
// +         return new ArchiveTaskOutput(id);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/create/ICreateColumn.java (12 linhas) -----
// + import jakarta.validation.Valid;
// + import jakarta.validation.constraints.NotBlank;
// + import jakarta.validation.constraints.NotNull;
// + import jakarta.validation.constraints.Size;
// + import org.springframework.validation.annotation.Validated;
// + 
// + @Validated
// +     CreateColumnOutput execute(@Valid CreateColumnInput input);
// +             @NotBlank(message = "O nome da coluna é obrigatório")
// +             @Size(max = 50, message = "O nome da coluna deve ter até 50 caracteres")
// +             @NotNull(message = "A posição da coluna é obrigatória")
// +             @NotNull(message = "O quadro é obrigatório")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/delete/DeleteColumn.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
// +         if (!repository.exists(id)) {
// +             throw new ColumnNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/move/IMoveColumn.java (8 linhas) -----
// + import jakarta.validation.Valid;
// + import jakarta.validation.constraints.NotNull;
// + import org.springframework.validation.annotation.Validated;
// + 
// + @Validated
// +     MoveColumnOutput execute(UUID id, @Valid MoveColumnInput input);
// +             @NotNull(message = "A nova posição é obrigatória")
// +             @NotNull(message = "O quadro é obrigatório")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/move/MoveColumn.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
// +         if (!repository.exists(id)) {
// +             throw new ColumnNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/update/IRenameColumn.java (9 linhas) -----
// + import jakarta.validation.Valid;
// + import jakarta.validation.constraints.NotBlank;
// + import jakarta.validation.constraints.Size;
// + import org.springframework.validation.annotation.Validated;
// + 
// + @Validated
// +     RenameColumnOutput execute(UUID id, @Valid RenameColumnInput input);
// +             @NotBlank(message = "O nome da coluna é obrigatório")
// +             @Size(max = 50, message = "O nome da coluna deve ter até 50 caracteres")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/usecases/update/RenameColumn.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions.ColumnNotFoundException;
// +         if (!repository.exists(id)) {
// +             throw new ColumnNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/infra/repositories/ITaskGroupRepository.java (2 linhas) -----
// +     boolean exists(UUID id);
// + 

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/infra/repositories/TaskGroupRepository.java (8 linhas) -----
// +     @Override
// +     public boolean exists(UUID id) {
// +         return db.sql("SELECT EXISTS(SELECT 1 FROM task_groups WHERE id = ?)")
// +                 .param(id)
// +                 .query(Boolean.class)
// +                 .single();
// +     }
// + 

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/application/controllers/UserController.java (9 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
// +     private final IAuthenticateUser authenticateUser;
// +             IAuthenticateUser authenticateUser,
// +         this.authenticateUser = authenticateUser;
// +     @PostMapping("login")
// +     public IAuthenticateUser.AuthenticateUserOutput login(@RequestBody IAuthenticateUser.AuthenticateUserInput input) {
// +         return authenticateUser.execute(input);
// +     }
// + 

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/models/Password.java (1 linhas) -----
// + @Size(min = 4, max = 8, message = "A senha deve ter entre 4 e 8 caracteres")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/models/Username.java (1 linhas) -----
// + @Size(min = 3, max = 10, message = "O nome de usuário deve ter entre 3 e 10 caracteres")

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/activate/ActivateUser.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
// +         if (!repository.existsById(id)) {
// +             throw new UserNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/create/CreateUser.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.EmailAlreadyExistsException;
// +         if (repository.existsByEmail(input.email())) {
// +             throw new EmailAlreadyExistsException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/create/ICreateUser.java (1 linhas) -----
// +             @Email(message = "Informe um e-mail válido") String email,

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update/IUpdateUser.java (1 linhas) -----
// +             @Email(message = "Informe um e-mail válido") String email

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update/UpdateUser.java (4 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
// +         if (!repository.existsById(id)) {
// +             throw new UserNotFoundException();
// +         }

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/update_password/UpdateUserPassword.java (10 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCurrentPasswordException;
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.UserNotFoundException;
// +         if (!repository.existsById(id)) {
// +             throw new UserNotFoundException();
// +         }
// +         final var updated = repository.updatePassword(id, input);
// +         if (updated == 0) {
// +             throw new InvalidCurrentPasswordException();
// +         }
// +         return new UpdateUserPasswordOutput(id);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/IUserRepository.java (9 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
// + import java.util.Optional;
// +     Optional<IAuthenticateUser.AuthenticatedUser> findByEmailAndPassword(String email, String password);
// + 
// +     int updatePassword(Long id, IUpdateUserPassword.UpdateUserPasswordInput input);
// + 
// +     boolean existsById(Long id);
// + 
// +     boolean existsByEmail(String email);

// ----- ADICIONADO em src/main/java/br/edu/ifce/mn/ads/ifproject/users/infra/repositories/UserRepository.java (37 linhas) -----
// + import br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate.IAuthenticateUser;
// + import java.util.Optional;
// +     @Override
// +     public Optional<IAuthenticateUser.AuthenticatedUser> findByEmailAndPassword(String email, String password) {
// +         final var SQL = """
// +                 SELECT id, username, email
// +                 FROM users
// +                 WHERE lower(email) = lower(?)
// +                   AND password_hash = md5(?)
// +                   AND is_active = true
// +                 """;
// + 
// +         return db.sql(SQL)
// +                 .param(email)
// +                 .param(password)
// +                 .query(IAuthenticateUser.AuthenticatedUser.class)
// +                 .optional();
// +     }
// + 
// +     public int updatePassword(Long id, IUpdateUserPassword.UpdateUserPasswordInput input) {
// +         return db.sql(SQL)
// + 
// +     @Override
// +     public boolean existsById(Long id) {
// +         return db.sql("SELECT EXISTS(SELECT 1 FROM users WHERE id = ?)")
// +                 .param(id)
// +                 .query(Boolean.class)
// +                 .single();
// +     }
// + 
// +     @Override
// +     public boolean existsByEmail(String email) {
// +         return db.sql("SELECT EXISTS(SELECT 1 FROM users WHERE lower(email) = lower(?))")
// +                 .param(email)
// +                 .query(Boolean.class)
// +                 .single();
// +     }

// ----- ADICIONADO em src/main/resources/application.yaml (10 linhas) -----
// +     url: jdbc:postgresql://localhost:5432/if-project
// +     password: postgres
// +   sql:
// +     init:
// +       mode: always
// + 
// + app:
// +   jwt:
// +     secret: "if-project-dev-secret-key-change-me-32b+"
// +     expiration: 24h

// ----- ADICIONADO em src/main/resources/schema.sql (8 linhas) -----
// + CREATE TABLE IF NOT EXISTS users
// + CREATE TABLE IF NOT EXISTS projects
// + CREATE TABLE IF NOT EXISTS project_members
// + CREATE TABLE IF NOT EXISTS boards
// + CREATE TABLE IF NOT EXISTS task_groups
// + CREATE TABLE IF NOT EXISTS tasks
// + CREATE TABLE IF NOT EXISTS subtasks
// + );

// =============================================================================
// PARTE C — ARQUIVOS NOVOS (ainda não rastreados pelo git) (621 linhas)
// =============================================================================

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/UnauthenticatedException.java (11 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class UnauthenticatedException extends ApiException {
// + 
// +     public UnauthenticatedException() {
// +         super(HttpStatus.UNAUTHORIZED, "Usuário não autenticado");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiErrorJson.java (35 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.http;
// + 
// + import jakarta.servlet.http.HttpServletResponse;
// + import org.springframework.http.HttpStatus;
// + import org.springframework.http.MediaType;
// + 
// + import java.io.IOException;
// + import java.time.Instant;
// + 
// + public final class ApiErrorJson {
// + 
// +     private ApiErrorJson() {
// +     }
// + 
// +     public static void write(HttpServletResponse response, HttpStatus status, String message) throws IOException {
// +         response.setStatus(status.value());
// +         response.setCharacterEncoding("UTF-8");
// +         response.setContentType(MediaType.APPLICATION_JSON_VALUE);
// +         response.getWriter().write("""
// +                 {"status":%d,"error":"%s","message":"%s","timestamp":"%s","fields":{}}
// +                 """.formatted(
// +                 status.value(),
// +                 escape(status.getReasonPhrase()),
// +                 escape(message),
// +                 Instant.now()
// +         ));
// +     }
// + 
// +     private static String escape(String value) {
// +         if (value == null) {
// +             return "";
// +         }
// +         return value.replace("\\", "\\\\").replace("\"", "\\\"");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiErrorResponse.java (28 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.http;
// + 
// + import org.springframework.http.HttpStatus;
// + 
// + import java.time.Instant;
// + import java.util.Map;
// + 
// + public record ApiErrorResponse(
// +         int status,
// +         String error,
// +         String message,
// +         String timestamp,
// +         Map<String, String> fields
// + ) {
// +     public static ApiErrorResponse of(HttpStatus status, String message) {
// +         return of(status, message, Map.of());
// +     }
// + 
// +     public static ApiErrorResponse of(HttpStatus status, String message, Map<String, String> fields) {
// +         return new ApiErrorResponse(
// +                 status.value(),
// +                 status.getReasonPhrase(),
// +                 message,
// +                 Instant.now().toString(),
// +                 fields == null ? Map.of() : fields
// +         );
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiException.java (17 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.http;
// + 
// + import org.springframework.http.HttpStatus;
// + 
// + public class ApiException extends RuntimeException {
// + 
// +     private final HttpStatus status;
// + 
// +     public ApiException(HttpStatus status, String message) {
// +         super(message);
// +         this.status = status;
// +     }
// + 
// +     public HttpStatus status() {
// +         return status;
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/http/ApiExceptionHandler.java (148 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.http;
// + 
// + import jakarta.validation.ConstraintViolation;
// + import jakarta.validation.ConstraintViolationException;
// + import org.springframework.core.Ordered;
// + import org.springframework.core.annotation.Order;
// + import org.springframework.dao.DataIntegrityViolationException;
// + import org.springframework.dao.EmptyResultDataAccessException;
// + import org.springframework.http.HttpStatus;
// + import org.springframework.http.ResponseEntity;
// + import org.springframework.http.converter.HttpMessageNotReadableException;
// + import org.springframework.validation.FieldError;
// + import org.springframework.web.HttpRequestMethodNotSupportedException;
// + import org.springframework.web.bind.MethodArgumentNotValidException;
// + import org.springframework.web.bind.MissingServletRequestParameterException;
// + import org.springframework.web.bind.annotation.ExceptionHandler;
// + import org.springframework.web.bind.annotation.RestControllerAdvice;
// + import org.springframework.web.method.annotation.HandlerMethodValidationException;
// + import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
// + import org.springframework.web.servlet.resource.NoResourceFoundException;
// + import tools.jackson.databind.exc.InvalidFormatException;
// + 
// + import java.util.LinkedHashMap;
// + import java.util.Map;
// + 
// + @Order(Ordered.HIGHEST_PRECEDENCE)
// + @RestControllerAdvice
// + public class ApiExceptionHandler {
// + 
// +     @ExceptionHandler(ApiException.class)
// +     public ResponseEntity<ApiErrorResponse> handleApiException(ApiException ex) {
// +         return ResponseEntity.status(ex.status()).body(ApiErrorResponse.of(ex.status(), ex.getMessage()));
// +     }
// + 
// +     @ExceptionHandler(MethodArgumentNotValidException.class)
// +     public ResponseEntity<ApiErrorResponse> handleValidation(MethodArgumentNotValidException ex) {
// +         Map<String, String> fields = new LinkedHashMap<>();
// +         for (FieldError error : ex.getBindingResult().getFieldErrors()) {
// +             fields.put(error.getField(), messageOrDefault(error.getDefaultMessage()));
// +         }
// +         return badRequest("Dados inválidos", fields);
// +     }
// + 
// +     @ExceptionHandler(HandlerMethodValidationException.class)
// +     public ResponseEntity<ApiErrorResponse> handleMethodValidation(HandlerMethodValidationException ex) {
// +         Map<String, String> fields = new LinkedHashMap<>();
// +         ex.getAllErrors().forEach(error -> {
// +             if (error instanceof FieldError fieldError) {
// +                 fields.put(fieldError.getField(), messageOrDefault(fieldError.getDefaultMessage()));
// +             } else {
// +                 fields.put("request", messageOrDefault(error.getDefaultMessage()));
// +             }
// +         });
// +         return badRequest("Dados inválidos", fields);
// +     }
// + 
// +     @ExceptionHandler(ConstraintViolationException.class)
// +     public ResponseEntity<ApiErrorResponse> handleConstraint(ConstraintViolationException ex) {
// +         Map<String, String> fields = new LinkedHashMap<>();
// +         for (ConstraintViolation<?> violation : ex.getConstraintViolations()) {
// +             fields.put(fieldName(violation), messageOrDefault(violation.getMessage()));
// +         }
// +         return badRequest("Dados inválidos", fields);
// +     }
// + 
// +     @ExceptionHandler(HttpMessageNotReadableException.class)
// +     public ResponseEntity<ApiErrorResponse> handleUnreadable(HttpMessageNotReadableException ex) {
// +         Throwable cause = ex.getCause();
// +         if (cause instanceof InvalidFormatException invalidFormat && invalidFormat.getTargetType() != null) {
// +             String field = invalidFormat.getPath() == null || invalidFormat.getPath().isEmpty()
// +                     ? "request"
// +                     : invalidFormat.getPath().getFirst().getPropertyName();
// +             String message = invalidFormat.getTargetType().isEnum()
// +                     ? "Valor inválido para " + field
// +                     : "Formato inválido para " + field;
// +             return badRequest(message, Map.of(field, message));
// +         }
// +         return badRequest("JSON inválido. Verifique os campos enviados.", Map.of());
// +     }
// + 
// +     @ExceptionHandler(MissingServletRequestParameterException.class)
// +     public ResponseEntity<ApiErrorResponse> handleMissingParam(MissingServletRequestParameterException ex) {
// +         return badRequest(
// +                 "Parâmetro obrigatório ausente",
// +                 Map.of(ex.getParameterName(), "Este parâmetro é obrigatório")
// +         );
// +     }
// + 
// +     @ExceptionHandler(MethodArgumentTypeMismatchException.class)
// +     public ResponseEntity<ApiErrorResponse> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
// +         String name = ex.getName() == null ? "request" : ex.getName();
// +         return badRequest("Valor inválido", Map.of(name, "Formato inválido"));
// +     }
// + 
// +     @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
// +     public ResponseEntity<ApiErrorResponse> handleMethodNotAllowed(HttpRequestMethodNotSupportedException ex) {
// +         return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(ApiErrorResponse.of(
// +                 HttpStatus.METHOD_NOT_ALLOWED,
// +                 "Método HTTP não permitido"
// +         ));
// +     }
// + 
// +     @ExceptionHandler(NoResourceFoundException.class)
// +     public ResponseEntity<ApiErrorResponse> handleNotFound(NoResourceFoundException ex) {
// +         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ApiErrorResponse.of(
// +                 HttpStatus.NOT_FOUND,
// +                 "Recurso não encontrado"
// +         ));
// +     }
// + 
// +     @ExceptionHandler(EmptyResultDataAccessException.class)
// +     public ResponseEntity<ApiErrorResponse> handleEmptyResult(EmptyResultDataAccessException ex) {
// +         return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ApiErrorResponse.of(
// +                 HttpStatus.NOT_FOUND,
// +                 "Recurso não encontrado"
// +         ));
// +     }
// + 
// +     @ExceptionHandler(DataIntegrityViolationException.class)
// +     public ResponseEntity<ApiErrorResponse> handleIntegrity(DataIntegrityViolationException ex) {
// +         return ResponseEntity.status(HttpStatus.CONFLICT).body(ApiErrorResponse.of(
// +                 HttpStatus.CONFLICT,
// +                 "Não foi possível salvar. Registro duplicado ou referência inválida."
// +         ));
// +     }
// + 
// +     @ExceptionHandler(Exception.class)
// +     public ResponseEntity<ApiErrorResponse> handleUnexpected(Exception ex) {
// +         return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ApiErrorResponse.of(
// +                 HttpStatus.INTERNAL_SERVER_ERROR,
// +                 "Erro interno. Tente novamente."
// +         ));
// +     }
// + 
// +     private static ResponseEntity<ApiErrorResponse> badRequest(String message, Map<String, String> fields) {
// +         return ResponseEntity.badRequest().body(ApiErrorResponse.of(HttpStatus.BAD_REQUEST, message, fields));
// +     }
// + 
// +     private static String fieldName(ConstraintViolation<?> violation) {
// +         String path = violation.getPropertyPath().toString();
// +         int lastDot = path.lastIndexOf('.');
// +         return lastDot >= 0 ? path.substring(lastDot + 1) : path;
// +     }
// + 
// +     private static String messageOrDefault(String message) {
// +         return message == null || message.isBlank() ? "Valor inválido" : message;
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/JwtAuthenticationFilter.java (81 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.security;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.UserLogged;
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiErrorJson;
// + import io.jsonwebtoken.JwtException;
// + import jakarta.servlet.FilterChain;
// + import jakarta.servlet.ServletException;
// + import jakarta.servlet.http.HttpServletRequest;
// + import jakarta.servlet.http.HttpServletResponse;
// + import org.springframework.http.HttpHeaders;
// + import org.springframework.http.HttpStatus;
// + import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// + import org.springframework.security.core.context.SecurityContextHolder;
// + import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
// + import org.springframework.web.filter.OncePerRequestFilter;
// + 
// + import java.io.IOException;
// + import java.util.List;
// + import java.util.UUID;
// + 
// + public class JwtAuthenticationFilter extends OncePerRequestFilter {
// + 
// +     private final JwtService jwtService;
// + 
// +     public JwtAuthenticationFilter(JwtService jwtService) {
// +         this.jwtService = jwtService;
// +     }
// + 
// +     @Override
// +     protected void doFilterInternal(
// +             HttpServletRequest request,
// +             HttpServletResponse response,
// +             FilterChain filterChain
// +     ) throws ServletException, IOException {
// +         final var header = request.getHeader(HttpHeaders.AUTHORIZATION);
// +         if (header == null || !header.startsWith("Bearer ")) {
// +             filterChain.doFilter(request, response);
// +             return;
// +         }
// + 
// +         final UUID userId;
// +         try {
// +             userId = jwtService.parseUserId(header.substring("Bearer ".length()));
// +         } catch (JwtException | IllegalArgumentException ex) {
// +             writeUnauthorized(response, "Token inválido ou expirado");
// +             return;
// +         }
// + 
// +         final var authentication = new UsernamePasswordAuthenticationToken(userId, null, List.of());
// +         authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
// +         SecurityContextHolder.getContext().setAuthentication(authentication);
// + 
// +         try {
// +             ScopedValue.where(UserLogged.USER_ID, userId.toString()).run(() -> {
// +                 try {
// +                     filterChain.doFilter(request, response);
// +                 } catch (IOException | ServletException e) {
// +                     throw new FilterChainException(e);
// +                 }
// +             });
// +         } catch (FilterChainException e) {
// +             if (e.getCause() instanceof IOException ioException) {
// +                 throw ioException;
// +             }
// +             if (e.getCause() instanceof ServletException servletException) {
// +                 throw servletException;
// +             }
// +             throw new ServletException(e.getCause());
// +         }
// +     }
// + 
// +     private static void writeUnauthorized(HttpServletResponse response, String message) throws IOException {
// +         ApiErrorJson.write(response, HttpStatus.UNAUTHORIZED, message);
// +     }
// + 
// +     private static final class FilterChainException extends RuntimeException {
// +         private FilterChainException(Throwable cause) {
// +             super(cause);
// +         }
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/JwtProperties.java (12 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.security;
// + 
// + import org.springframework.boot.context.properties.ConfigurationProperties;
// + 
// + import java.time.Duration;
// + 
// + @ConfigurationProperties(prefix = "app.jwt")
// + public record JwtProperties(
// +         String secret,
// +         Duration expiration
// + ) {
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/JwtService.java (43 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.security;
// + 
// + import io.jsonwebtoken.Jwts;
// + import io.jsonwebtoken.security.Keys;
// + import org.springframework.stereotype.Component;
// + 
// + import javax.crypto.SecretKey;
// + import java.nio.charset.StandardCharsets;
// + import java.time.Instant;
// + import java.util.Date;
// + import java.util.UUID;
// + 
// + @Component
// + public class JwtService {
// + 
// +     private final JwtProperties properties;
// +     private final SecretKey key;
// + 
// +     public JwtService(JwtProperties properties) {
// +         this.properties = properties;
// +         this.key = Keys.hmacShaKeyFor(properties.secret().getBytes(StandardCharsets.UTF_8));
// +     }
// + 
// +     public String issue(UUID userId) {
// +         final var now = Instant.now();
// +         return Jwts.builder()
// +                 .subject(userId.toString())
// +                 .issuedAt(Date.from(now))
// +                 .expiration(Date.from(now.plus(properties.expiration())))
// +                 .signWith(key)
// +                 .compact();
// +     }
// + 
// +     public UUID parseUserId(String token) {
// +         final var subject = Jwts.parser()
// +                 .verifyWith(key)
// +                 .build()
// +                 .parseSignedClaims(token)
// +                 .getPayload()
// +                 .getSubject();
// +         return UUID.fromString(subject);
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/OpenApiConfig.java (23 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.security;
// + 
// + import io.swagger.v3.oas.models.Components;
// + import io.swagger.v3.oas.models.OpenAPI;
// + import io.swagger.v3.oas.models.security.SecurityRequirement;
// + import io.swagger.v3.oas.models.security.SecurityScheme;
// + import org.springframework.context.annotation.Bean;
// + import org.springframework.context.annotation.Configuration;
// + 
// + @Configuration
// + public class OpenApiConfig {
// + 
// +     @Bean
// +     OpenAPI openAPI() {
// +         final var schemeName = "bearer-jwt";
// +         return new OpenAPI()
// +                 .components(new Components().addSecuritySchemes(schemeName, new SecurityScheme()
// +                         .type(SecurityScheme.Type.HTTP)
// +                         .scheme("bearer")
// +                         .bearerFormat("JWT")))
// +                 .addSecurityItem(new SecurityRequirement().addList(schemeName));
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/_commons/security/SecurityConfig.java (78 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject._commons.security;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiErrorJson;
// + import org.springframework.boot.context.properties.EnableConfigurationProperties;
// + import org.springframework.context.annotation.Bean;
// + import org.springframework.context.annotation.Configuration;
// + import org.springframework.http.HttpMethod;
// + import org.springframework.http.HttpStatus;
// + import org.springframework.security.config.Customizer;
// + import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// + import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// + import org.springframework.security.config.http.SessionCreationPolicy;
// + import org.springframework.security.web.SecurityFilterChain;
// + import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
// + import org.springframework.web.cors.CorsConfiguration;
// + import org.springframework.web.cors.CorsConfigurationSource;
// + import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
// + 
// + import java.util.List;
// + 
// + @Configuration
// + @EnableWebSecurity
// + @EnableConfigurationProperties(JwtProperties.class)
// + public class SecurityConfig {
// + 
// +     @Bean
// +     JwtAuthenticationFilter jwtAuthenticationFilter(JwtService jwtService) {
// +         return new JwtAuthenticationFilter(jwtService);
// +     }
// + 
// +     @Bean
// +     SecurityFilterChain securityFilterChain(HttpSecurity http, JwtAuthenticationFilter jwtAuthenticationFilter) throws Exception {
// +         return http
// +                 .csrf(csrf -> csrf.disable())
// +                 .cors(Customizer.withDefaults())
// +                 .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
// +                 .authorizeHttpRequests(auth -> auth
// +                         .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
// +                         .requestMatchers(HttpMethod.POST, "/api/v1/users", "/api/v1/users/login").permitAll()
// +                         .requestMatchers(
// +                                 "/swagger-ui/**",
// +                                 "/swagger-ui.html",
// +                                 "/v3/api-docs/**",
// +                                 "/error"
// +                         ).permitAll()
// +                         .anyRequest().authenticated()
// +                 )
// +                 .exceptionHandling(handling -> handling
// +                         .authenticationEntryPoint((request, response, ex) ->
// +                                 ApiErrorJson.write(response, HttpStatus.UNAUTHORIZED, "Não autenticado")
// +                         )
// +                         .accessDeniedHandler((request, response, ex) ->
// +                                 ApiErrorJson.write(response, HttpStatus.FORBIDDEN, "Você não tem permissão para esta ação")
// +                         )
// +                 )
// +                 .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
// +                 .build();
// +     }
// + 
// +     @Bean
// +     CorsConfigurationSource corsConfigurationSource() {
// +         final var config = new CorsConfiguration();
// +         config.setAllowedOrigins(List.of(
// +                 "http://localhost:5173",
// +                 "http://localhost:3000",
// +                 "http://127.0.0.1:5173",
// +                 "http://127.0.0.1:3000"
// +         ));
// +         config.setAllowedMethods(List.of("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
// +         config.setAllowedHeaders(List.of("*"));
// +         config.setExposedHeaders(List.of("Authorization"));
// +         config.setAllowCredentials(true);
// + 
// +         final var source = new UrlBasedCorsConfigurationSource();
// +         source.registerCorsConfiguration("/**", config);
// +         return source;
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/exceptions/BoardNotFoundException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class BoardNotFoundException extends ApiException {
// +     public BoardNotFoundException() {
// +         super(HttpStatus.NOT_FOUND, "Quadro não encontrado");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/boards/domain/exceptions/BoardUnauthorizedException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.boards.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class BoardUnauthorizedException extends ApiException {
// +     public BoardUnauthorizedException() {
// +         super(HttpStatus.FORBIDDEN, "Você não tem permissão para excluir este quadro");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/task/domain/exceptions/TaskNotFoundException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.task.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class TaskNotFoundException extends ApiException {
// +     public TaskNotFoundException() {
// +         super(HttpStatus.NOT_FOUND, "Tarefa não encontrada");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/task_groups/domain/exceptions/ColumnNotFoundException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.task_groups.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class ColumnNotFoundException extends ApiException {
// +     public ColumnNotFoundException() {
// +         super(HttpStatus.NOT_FOUND, "Coluna não encontrada");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/EmailAlreadyExistsException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class EmailAlreadyExistsException extends ApiException {
// +     public EmailAlreadyExistsException() {
// +         super(HttpStatus.CONFLICT, "Este e-mail já está em uso");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/InvalidCredentialsException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class InvalidCredentialsException extends ApiException {
// +     public InvalidCredentialsException() {
// +         super(HttpStatus.UNAUTHORIZED, "E-mail ou senha não conferem.");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/InvalidCurrentPasswordException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class InvalidCurrentPasswordException extends ApiException {
// +     public InvalidCurrentPasswordException() {
// +         super(HttpStatus.BAD_REQUEST, "A senha atual não confere");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/exceptions/UserNotFoundException.java (10 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.exceptions;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.http.ApiException;
// + import org.springframework.http.HttpStatus;
// + 
// + public class UserNotFoundException extends ApiException {
// +     public UserNotFoundException() {
// +         super(HttpStatus.NOT_FOUND, "Usuário não encontrado");
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/authenticate/AuthenticateUser.java (30 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;
// + 
// + import br.edu.ifce.mn.ads.ifproject._commons.security.JwtService;
// + import br.edu.ifce.mn.ads.ifproject.users.domain.exceptions.InvalidCredentialsException;
// + import br.edu.ifce.mn.ads.ifproject.users.infra.repositories.IUserRepository;
// + import org.springframework.stereotype.Component;
// + 
// + @Component
// + public class AuthenticateUser implements IAuthenticateUser {
// + 
// +     private final IUserRepository repository;
// +     private final JwtService jwtService;
// + 
// +     public AuthenticateUser(IUserRepository repository, JwtService jwtService) {
// +         this.repository = repository;
// +         this.jwtService = jwtService;
// +     }
// + 
// +     @Override
// +     public AuthenticateUserOutput execute(AuthenticateUserInput input) {
// +         final var user = repository.findByEmailAndPassword(input.email(), input.password())
// +                 .orElseThrow(InvalidCredentialsException::new);
// +         return new AuthenticateUserOutput(
// +                 user.id(),
// +                 user.username(),
// +                 user.email(),
// +                 jwtService.issue(user.id())
// +         );
// +     }
// + }

// ----- NOVO ARQUIVO src/main/java/br/edu/ifce/mn/ads/ifproject/users/domain/usecases/commands/authenticate/IAuthenticateUser.java (35 linhas) -----
// + package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.authenticate;
// + 
// + import br.edu.ifce.mn.ads.ifproject.users.domain.models.Password;
// + import jakarta.validation.Valid;
// + import jakarta.validation.constraints.Email;
// + import org.springframework.validation.annotation.Validated;
// + 
// + import java.util.UUID;
// + 
// + @Validated
// + public interface IAuthenticateUser {
// + 
// +     AuthenticateUserOutput execute(@Valid AuthenticateUserInput input);
// + 
// +     record AuthenticateUserInput(
// +             @Email(message = "Informe um e-mail válido") String email,
// +             @Password String password
// +     ) {
// +     }
// + 
// +     record AuthenticatedUser(
// +             UUID id,
// +             String username,
// +             String email
// +     ) {
// +     }
// + 
// +     record AuthenticateUserOutput(
// +             UUID id,
// +             String username,
// +             String email,
// +             String token
// +     ) {
// +     }
// + }

