package br.edu.ifce.mn.ads.ifproject.users.domain.usecases;

public interface IActivateUser {

    ActivateUserOutput execute(Long id);

    record ActivateUserOutput(
            Long id
    ) {
    }
}
