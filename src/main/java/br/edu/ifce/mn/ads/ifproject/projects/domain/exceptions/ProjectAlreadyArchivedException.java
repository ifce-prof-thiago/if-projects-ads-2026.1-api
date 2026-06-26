package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import java.util.UUID;

public class ProjectAlreadyArchivedException extends RuntimeException {

    public ProjectAlreadyArchivedException(UUID id) {
        super("Project is already archived: " + id, null, true, false);
    }
}
