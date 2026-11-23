package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.activate;

import java.util.UUID;

public interface IActivateUser {

    ActivateUserOutput execute(UUID id);

    record ActivateUserOutput(
            UUID id
    ) {
    }
}
