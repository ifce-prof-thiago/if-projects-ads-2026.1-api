package br.edu.ifce.mn.ads.ifproject.projects.domain.exceptions;

import java.util.UUID;

public class CannotTransferToNonMemberException extends RuntimeException {

    public CannotTransferToNonMemberException(UUID userId) {
        super("Cannot transfer ownership to a non-member: " + userId, null, true, false);

    }
}
