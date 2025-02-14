package edu.tienda.core.controllers;

import edu.tienda.core.domain.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteRestController {
    private List<Cliente> clientes = List.of(
            Cliente.builder()
                    .nombre("Max")
                    .username("Maximum")
                    .password("123")
                    .build(),
            Cliente.builder()
                    .nombre("Lofi")
                    .username("lofixx")
                    .password("1234")
                    .build()
    );

    @GetMapping("/clientes")
    public List<Cliente> getClientes() {
        return clientes;
    }
}
