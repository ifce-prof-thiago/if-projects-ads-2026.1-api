package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import java.util.UUID;

public class MemberNotFoundException extends RuntimeException {

    public MemberNotFoundException(UUID userId) {
        super("Member not found in project: " + userId, null, true, false);

    }
}
