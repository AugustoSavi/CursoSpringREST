package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1l);
		cliente1.setNome("Test1");
		cliente1.setEmail("@");
		cliente1.setTelefone("9999999999");
		
		var cliente2 = new Cliente();
		cliente2.setId(2l);
		cliente2.setNome("Testqeqwdassa2");
		cliente2.setEmail("@");
		cliente2.setTelefone("9999999999");
		
		return Arrays.asList(cliente1,cliente2);
	}
}
