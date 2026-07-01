package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.delete_project;

import java.util.UUID;

public interface IDeleteProject {

    DeleteProjectOutput execute(UUID projectId);

    record DeleteProjectOutput(UUID id) {
    }
}