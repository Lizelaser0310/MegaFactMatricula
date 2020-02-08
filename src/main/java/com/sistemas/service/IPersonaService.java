package com.sistemas.service;

import java.util.List;
import com.sistemas.model.Persona;

public interface IPersonaService {
	
	Persona registrar(Persona persona);
	
	void modificar(Persona persona);
	
	void eliminar(int id);
	
	Persona listarID(int id);
	
	List<Persona>listar();

}
