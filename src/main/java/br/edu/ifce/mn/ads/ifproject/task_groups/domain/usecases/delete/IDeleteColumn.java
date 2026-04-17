package br.edu.ifce.mn.ads.ifproject.task_groups.domain.usecases.delete;

public interface IDeleteColumn {
    IDeleteColumnOutput execute(Long id);

    record IDeleteColumnOutput(
            Long id
    ) {
    }
}
