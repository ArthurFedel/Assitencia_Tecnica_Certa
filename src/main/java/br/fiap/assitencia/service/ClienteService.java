package br.fiap.assitencia.service;

import br.fiap.assitencia.domain.Cliente;
import br.fiap.assitencia.dto.ClienteRequest;
import br.fiap.assitencia.dto.ClienteResponse;
import br.fiap.assitencia.mapper.Mapper;
import br.fiap.assitencia.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService {
    private final ClienteRepository repo;
    private final Mapper mapper;

    @Transactional
    public ClienteResponse salvar(ClienteRequest request){
        Cliente cliente = mapper.paraEntidade(request);
        Cliente clienteSalvo = repo.save(cliente);
        return mapper.paraResposta(clienteSalvo);
    }

    public ClienteResponse pesquisar (Long id){
        Cliente cliente = repo.findById(id).orElseThrow();
        return mapper.paraResposta(cliente);
    }

    public List<ClienteResponse> listar() {
        return repo.findAll()
                .stream()
                .map(mapper::paraResposta)
                .toList();
    }
}
