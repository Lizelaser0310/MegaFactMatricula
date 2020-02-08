package com.sistemas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.dao.ICursoDAO;
import com.sistemas.model.Curso;

@Service
public class CursoServiceImpl implements ICursoService{

	@Autowired
	private ICursoDAO dao;
	
	@Override
	public Curso registrar(Curso curso) {
		// TODO Auto-generated method stub
		return dao.save(curso);
	}

	@Override
	public void modificar(Curso curso) {
		// TODO Auto-generated method stub
		dao.save(curso);
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);
	}

	@Override
	public Curso listarID(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Curso> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
