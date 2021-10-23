package com.msclientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msclientes.service.ClienteService;
import com.persistence.entity.Cliente;
import com.persistence.request.ClienteRequest;

@RestController
@RequestMapping("/clientes")

public class ClienteController {
	@Autowired
	ClienteService service;

	@GetMapping
	public List<Cliente> MostrarTodos() {
		return service.MostrarTodos();
	}
@PostMapping 
	public Cliente Guardar (@RequestBody ClienteRequest request) {
		return service.Guardar(request);

	}
@GetMapping("buscar-por-id/{id} ") 
	public Cliente getById(@PathVariable int id) {
		return service.Buscar(id);

	}
@PutMapping
	public Cliente Actualizar(@RequestBody ClienteRequest request) {

		return service.Actualizar(request);

	}
@DeleteMapping ("/{id}")
	public String eliminar(@PathVariable int id) {
		return service.Eliminar(id);
	}
}
