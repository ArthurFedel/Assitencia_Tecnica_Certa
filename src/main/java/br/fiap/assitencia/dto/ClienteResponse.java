package br.fiap.assitencia.dto;

public record ClienteResponse(
        Long id,
        String nome,
        String telefone,
        String email
) {
}
