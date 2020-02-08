package com.sistemas.service;

import java.util.List;

import com.sistemas.model.Curso;


public interface ICursoService {
	
	Curso registrar(Curso curso);
	
	void modificar(Curso curso);
	
	void eliminar (int id);
	
	Curso listarID(int id);

	List<Curso> listar();
}
