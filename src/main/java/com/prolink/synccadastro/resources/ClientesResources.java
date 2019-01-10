package com.prolink.synccadastro.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prolink.synccadastro.services.ClientesServices;

@RestController
@RequestMapping(value="/clientes")
public class ClientesResources {
	
	@Autowired
	private ClientesServices clientes;
	
	@RequestMapping(value="/aniversarios")
	ResponseEntity<?> aniversariantes(){
		return ResponseEntity.status(HttpStatus.OK).body(clientes.getAniversariantes());
	}

}
