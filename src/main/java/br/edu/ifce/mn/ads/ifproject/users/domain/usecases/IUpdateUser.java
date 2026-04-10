package br.edu.ifce.mn.ads.ifproject.users.domain.usecases;

public interface IUpdateUser {

    UpdateUserOutput execute(Long id, UpdateUserInput input);

    record UpdateUserInput(
            String username,
            String email
    ) {
    }

    record UpdateUserOutput(
            Long id
    ) {
    }
}
