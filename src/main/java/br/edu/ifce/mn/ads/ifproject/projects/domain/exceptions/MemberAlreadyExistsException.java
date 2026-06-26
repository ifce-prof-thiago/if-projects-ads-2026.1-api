package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import java.util.UUID;

public class MemberAlreadyExistsException extends RuntimeException {

    public MemberAlreadyExistsException(UUID projectId, UUID userId) {
        super("Member " + userId + " already exists in project " + projectId, null, true, false);
    }
}
