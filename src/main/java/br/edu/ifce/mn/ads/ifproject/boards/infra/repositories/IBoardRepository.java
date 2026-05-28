package br.edu.ifce.mn.ads.ifproject.boards.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.boards.domain.models.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface IBoardRepository extends JpaRepository<Board, UUID> {
    // O Spring Data JPA vai olhar e saber que a tabela usa UUID como chave primária.
}