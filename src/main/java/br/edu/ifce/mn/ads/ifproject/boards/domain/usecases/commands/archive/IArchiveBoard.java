package br.edu.ifce.mn.ads.ifproject.boards.domain.usecases.commands.archive;

import java.util.UUID;

public interface IArchiveBoard {

    // O método principal que o Controller vai chamar
    ArchiveBoardOutput execute(UUID id);

    // Record é uma forma moderna em Java de criar classes de dados puras (só getters)
    // Aqui define o que o caso de uso devolve quando termina
    public record ArchiveBoardOutput(
            UUID id,
            String name,
            boolean isArchived
    ) {}
}