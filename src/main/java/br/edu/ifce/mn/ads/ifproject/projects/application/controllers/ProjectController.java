package br.edu.ifce.mn.ads.ifproject.projects.application.controllers;

import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.archive_project.IArchiveProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.create_project.ICreateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.restore_project.IRestoreProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.transfer_ownership.ITransferOwnership;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_member_role.IUpdateMemberRole;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.update_project.IUpdateProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.delete_project.IDeleteProject;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.find_project.IFindProjectByIdAndUserId;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_members.IListMembers;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_projects.IListProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.queries.list_archived_projects.IListArchivedProjects;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.add_member.IAddMember;
import br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.remove_member.IRemoveMember;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectMemberRepository;
import br.edu.ifce.mn.ads.ifproject.projects.infra.repositories.IProjectRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {

    private final ICreateProject createProject;
    private final IUpdateProject updateProject;
    private final IDeleteProject deleteProject;
    private final IListProjects listProjects;
    private final IListArchivedProjects listArchivedProjects;
    private final IFindProjectByIdAndUserId findProject;
    private final IAddMember addMember;
    private final IRemoveMember removeMember;
    private final IArchiveProject archiveProject;
    private final IRestoreProject restoreProject;
    private final ITransferOwnership transferOwnership;
    private final IUpdateMemberRole updateMemberRole;
    private final IListMembers listMembers;

    public ProjectController(ICreateProject createProject,
                             IUpdateProject updateProject,
                             IDeleteProject deleteProject,
                             IListProjects listProjects,
                             IListArchivedProjects listArchivedProjects,
                             IFindProjectByIdAndUserId findProject,
                             IAddMember addMember,
                             IRemoveMember removeMember,
                             IArchiveProject archiveProject,
                             IRestoreProject restoreProject,
                             ITransferOwnership transferOwnership,
                             IUpdateMemberRole updateMemberRole,
                             IListMembers listMembers) {
        this.createProject = createProject;
        this.updateProject = updateProject;
        this.deleteProject = deleteProject;
        this.listProjects = listProjects;
        this.listArchivedProjects = listArchivedProjects;
        this.findProject = findProject;
        this.addMember = addMember;
        this.removeMember = removeMember;
        this.archiveProject = archiveProject;
        this.restoreProject = restoreProject;
        this.updateMemberRole = updateMemberRole;
        this.listMembers = listMembers;
        this.transferOwnership = transferOwnership;
    }

    //@RequestHeader("X-User-Id") (provisório) → Spring Security (futuro)
    @PostMapping
    public ICreateProject.CreateProjectOutput post(@RequestBody ICreateProject.CreateProjectInput body) {
        return createProject.execute(body);
    }

    //@RequestHeader("X-User-Id") (provisório) → Spring Security (futuro)
    @PutMapping("/{id}")
    public IUpdateProject.UpdateProjectOutput update(
            @PathVariable UUID id,
            @RequestBody IUpdateProject.UpdateProjectInput input) {

        return updateProject.execute(id, input);
    }

    @GetMapping
    public List<IProjectRepository.ListProjectsOutput> get(Pageable pageable) {
        return listProjects.execute(pageable);
    }

    //@RequestHeader("X-User-Id") (provisório) → Spring Security (futuro)
    @GetMapping("/{id}")
    public IProjectRepository.FindProjectOutput getById(
            @PathVariable UUID id) {

        return findProject.execute(id);
    }

    @DeleteMapping("/{id}")
    public IDeleteProject.DeleteProjectOutput delete(@PathVariable UUID id) {
        return deleteProject.execute(id);
    }

    @PostMapping("/{id}/members")
    public IAddMember.AddMemberOutput postMember(
            @PathVariable UUID id,
            @RequestBody IAddMember.AddMemberInput input) {
        return addMember.execute(id, input);
    }

    @DeleteMapping("/{id}/members/{userId}")
    public IRemoveMember.RemoveMemberOutput deleteMember(
            @PathVariable UUID id,
            @PathVariable UUID userId) {
        return removeMember.execute(id, userId);
    }

    @PatchMapping("/{id}/archive")
    public IArchiveProject.ArchiveProjectOutput archive(@PathVariable UUID id) {
        return archiveProject.execute(id);
    }

    @PatchMapping("/{id}/restore")
    public IRestoreProject.RestoreProjectOutput restore(@PathVariable UUID id) {
        return restoreProject.execute(id);
    }

    @GetMapping("/archived")
    public List<IListArchivedProjects.IListArchivedProjectsOutput> get(@RequestParam UUID userId, Pageable pageable) {
        var input = new IListArchivedProjects.ListArchivedProjectsInput(userId, pageable);
        return listArchivedProjects.execute(input, pageable);
    }

    @GetMapping("/{id}/members")
    public List<IProjectMemberRepository.ListMembersOutput> getMembers(
            @PathVariable UUID id, Pageable pageable) {
        return listMembers.execute(id, pageable);
    }

    @PatchMapping("/{id}/members/{userId}")
    public IUpdateMemberRole.UpdateMemberRoleOutput patchMemberRole(
            @PathVariable UUID id,
            @PathVariable UUID userId,
            @RequestBody IUpdateMemberRole.UpdateMemberRoleInput input) {
        return updateMemberRole.execute(id, userId, input);
    }

    @PatchMapping("/{id}/transfer")
    public ITransferOwnership.TransferOwnershipOutput transfer(
            @PathVariable UUID id,
            @RequestBody ITransferOwnership.TransferOwnershipInput input) {
        return transferOwnership.execute(id, input);
    }


}
