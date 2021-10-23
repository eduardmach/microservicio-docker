package com.msclientes.service;

import java.util.List;

import com.persistence.entity.Cliente;
import com.persistence.request.ClienteRequest;

public interface ClienteService {/*inter face de negoci,contiene las o
peraciones propias 
del negocio dode estemos programando*/
 

	public List<Cliente>MostrarTodos();
	
	public Cliente Guardar (ClienteRequest request );
	
	public Cliente Actualizar (ClienteRequest request);
	
	public Cliente Buscar (int id);
	
	public String Eliminar (int id);
	
		
	
	
}
