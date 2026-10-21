package br.fiap.assitencia.service;

import br.fiap.assitencia.domain.Cliente;
import br.fiap.assitencia.dto.ClienteRequest;
import br.fiap.assitencia.dto.ClienteResponse;
import br.fiap.assitencia.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository repo;

    public ClienteResponse salvar(ClienteRequest request){
        Cliente cliente = mapper.paraEntidade(request);
        Cliente clienteSalvo = repo.save(cliente);
        return mapper.paraResposta(clienteSalvo);
    }
}
