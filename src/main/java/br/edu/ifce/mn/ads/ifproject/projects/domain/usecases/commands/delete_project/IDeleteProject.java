package br.edu.ifce.mn.ads.ifproject.projects.domain.usecases.commands.delete_project;

import br.edu.ifce.mn.ads.ifproject.projects.domain.models.ProjectName;

public interface IDeleteProject {

    record DeleteProjectRequest(@ProjectName String name){}
}
