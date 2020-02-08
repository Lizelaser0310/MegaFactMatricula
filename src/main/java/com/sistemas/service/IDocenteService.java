package com.sistemas.service;


import com.sistemas.model.Docente;

import java.util.List;

public interface IDocenteService {
	
    Docente registrar(Docente docente);

    void modificar(Docente docente);

    void eliminar (int id);

    Docente listarID(int id);

    List<Docente> listar();

}
