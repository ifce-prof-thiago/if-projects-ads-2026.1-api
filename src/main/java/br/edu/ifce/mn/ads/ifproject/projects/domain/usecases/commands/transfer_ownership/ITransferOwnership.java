package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.transfer_ownership;

import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

import java.util.UUID;

@Validated
public interface ITransferOwnership {

    TransferOwnershipOutput execute(UUID projectId, @Valid TransferOwnershipInput input);

    record TransferOwnershipInput(UUID newOwnerId) {
    }

    record TransferOwnershipOutput(UUID projectId, UUID newOwnerId) {
    }
}
