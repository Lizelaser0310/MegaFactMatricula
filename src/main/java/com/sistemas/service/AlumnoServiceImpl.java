package com.sistemas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.dao.IAlumnoDAO;
import com.sistemas.model.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService {
	
	@Autowired
	private IAlumnoDAO dao;

    @Override
    public Alumno registrar(Alumno alumno) {
        return dao.save(alumno);
    }

    @Override
    public void modificar(Alumno alumno) {
        dao.save(alumno);
    }

    @Override
    public void eliminar(int id) {
    	dao.deleteById(id);
    }

    @Override
    public Alumno listarID(int id) {
        return dao.findById(id).get();
    }

    @Override
    public List<Alumno> listar() {
        return dao.findAll();
    }

}
