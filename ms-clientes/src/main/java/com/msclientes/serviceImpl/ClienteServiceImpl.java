package com.msclientes.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclientes.service.ClienteService;
import com.persistence.entity.Cliente;
import com.persistence.repositorio.ClienteRepositorio;
import com.persistence.request.ClienteRequest;

@Service
public class ClienteServiceImpl implements ClienteService {
	/*
	 * 
	 */
	@Autowired
	ClienteRepositorio repo;

	@Override
	public List<Cliente> MostrarTodos() {

		return repo.findAll();
	}

	@Override
	public Cliente Guardar(ClienteRequest request) {

		Cliente cl = new Cliente();
		cl.setNombre(request.getNombre());
		cl.setaPat(request.getaPat());
		cl.setaMat(request.getaMat());
		cl.setCorreo(request.getCorreo());
		cl.setDomicilio(request.getDomicilio());
		cl.setTelefono(request.getTelefono());
		cl.setFechaNac(request.getFechaNac());
		repo.save(cl);
		return cl;
	}

	@Override
	public Cliente Actualizar(ClienteRequest request) {
		Cliente cl = repo.findById(request.getClienteId()).get();

		
		cl.setNombre(request.getNombre());
		cl.setaPat(request.getaPat());
		cl.setaMat(request.getaMat());
		cl.setCorreo(request.getCorreo());
		cl.setDomicilio(request.getDomicilio());
		cl.setTelefono(request.getTelefono());
		cl.setFechaNac(request.getFechaNac());
		repo.save(cl);

		return cl;

	}

	@Override
	public Cliente Buscar(int id) {
		Cliente cl = repo.findById(id).get();

		return cl;
	}

	@Override
	public String Eliminar(int id) {

		repo.deleteById(id);
		return "Eliminado";

	}

}
