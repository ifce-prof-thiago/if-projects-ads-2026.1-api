package br.edu.ifce.mn.ads.ifproject.auth.application.controllers.dtos;

public record LoginDTO(
    String email,
    String password
) {

}