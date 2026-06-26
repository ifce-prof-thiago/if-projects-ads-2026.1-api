package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.restore_project;

import java.util.UUID;

public interface IRestoreProject {

    RestoreProjectOutput execute(UUID projectId);

    record RestoreProjectOutput(UUID id) {
    }
}
