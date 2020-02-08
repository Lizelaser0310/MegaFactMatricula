package com.sistemas.service;

import java.util.List;

import com.sistemas.model.Alumno;

public interface IAlumnoService {
	
	Alumno registrar(Alumno alumno);
	
	void modificar(Alumno alumno);
	
	void eliminar (int id);
	
	Alumno listarID(int id);

	List<Alumno> listar();

}
