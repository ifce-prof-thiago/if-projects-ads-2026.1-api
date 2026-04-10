package br.edu.ifce.mn.ads.ifproject.users.domain.usecases;

public interface ICreateUser {

    CreateUserOutput execute(CreateUserInput input);

    record CreateUserInput(
            String username,
            String email,
            String password
    ) {
    }

    record CreateUserOutput(
            Long id
    ) {
    }

}
