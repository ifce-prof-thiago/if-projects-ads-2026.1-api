package br.edu.ifce.mn.ads.ifproject.users.domain.usecases;

public interface IUpdateUserPassword {

    UpdateUserPasswordOutput execute(Long id, UpdateUserPasswordInput input);

    record UpdateUserPasswordInput(
            String oldPassword,
            String newPassword
    ) {
    }

    record UpdateUserPasswordOutput(
            Long id
    ) {
    }

}
