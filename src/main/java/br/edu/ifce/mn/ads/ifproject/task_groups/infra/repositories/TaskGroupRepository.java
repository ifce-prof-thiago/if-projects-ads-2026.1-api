package br.edu.ifce.mn.ads.ifproject.task_groups.infra.repositories;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;

@Component
public class TaskGroupRepository implements  ITaskGroupRepository{

    private final JdbcClient db;

    public TaskGroupRepository(JdbcClient db) {
        this.db = db;
    }
}
