package com.javasp.api.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasp.domain.model.cliente;

@RestController
public class clientecontroller {
	
	@GetMapping("/cliente") 
	
	public List<cliente> listar() {
		
		var cliente1 = new cliente();
		cliente1.setId(1L);
		cliente1.setNome("joao");
		cliente1.setEmail("joao@gmail.com");
		cliente1.setTelefone("13 9999-6666");
		
		var cliente2 = new cliente();
		cliente2.setId(2L);
		cliente2.setNome("maria");
		cliente2.setEmail("maria@gmail.com");
		cliente2.setTelefone("45 9999-6666");
		
		return Arrays.asList(cliente1, cliente2);
		
		
	}
	

}
