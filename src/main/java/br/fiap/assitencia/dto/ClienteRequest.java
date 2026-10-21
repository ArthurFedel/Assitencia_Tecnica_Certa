package br.fiap.assitencia.dto;

public record ClienteRequest(
        String nome,
        String telefone,
        String email,
        String senha) {
}
