package br.fiap.assitencia.controller;

import br.fiap.assitencia.domain.Cliente;
import br.fiap.assitencia.dto.ClienteRequest;
import br.fiap.assitencia.dto.ClienteResponse;
import br.fiap.assitencia.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class Controller {
    private final ClienteService service;

    @PostMapping("/salvar")
    public ClienteResponse salvar(@RequestBody ClienteRequest dto) {
        return service.salvar(dto);
    }

    @GetMapping("/pesquisar/{id}")
    public ClienteResponse pesquisar(@PathVariable Long id) {
        return service.pesquisar(id);
    }

    @GetMapping("/listar")
    public List<ClienteResponse> listar(){
        return service.listar();
    }
}
