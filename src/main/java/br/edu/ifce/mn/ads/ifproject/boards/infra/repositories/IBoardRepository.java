package br.edu.ifce.mn.ads.ifproject.board.infra.repositories;

import br.edu.ifce.mn.ads.ifproject.board.domain.model.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface IBoardRepository extends CrudRepository<Board, UUID> {
}