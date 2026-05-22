package br.edu.ifce.mn.ads.ifproject.users.domain.usecases.commands.deactivate;

public interface IDeactivateUser {

    // defino o contrato do que o deactivate precisa fazer — receber um id e retornar o id desativado
    DeactivateUserOutput execute(Long id);

    // crio o objeto de resposta que vai ser retornado depois de desativar a conta
    record DeactivateUserOutput(
            Long id
    ) {
    }
}