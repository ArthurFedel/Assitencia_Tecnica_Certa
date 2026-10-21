package br.fiap.assitencia.repository;

import br.fiap.assitencia.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.security.Provider;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}

