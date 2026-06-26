package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import java.util.UUID;

public class ProjectNotArchivedException extends RuntimeException {

    public ProjectNotArchivedException(UUID id) {
        super("Project is not archived: " + id, null, true, false);
    }
}
