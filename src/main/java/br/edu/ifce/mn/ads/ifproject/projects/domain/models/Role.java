package br.edu.ifce.mn.ads.ifproject.projects.domain.models;

public enum Role {

    // apenas visualiza, não pode editar nada
    VIEWER,

    // pode criar e editar tarefas dentro do projeto
    MEMBER,

    // pode gerenciar o projeto: adicionar/remover membros,
    // excluir quadros e projetos (junto com OWNER)
    ADMIN,

    // criador do projeto e tem o controle total
    // único que pode transferir a propriedade do projeto
    // junto com o ADMIN pode excluir projetos e quadros e adicionar novos membros
    OWNER
}
