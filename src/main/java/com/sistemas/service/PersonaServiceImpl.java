package com.sistemas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.dao.IPersonaDAO;
import com.sistemas.model.Persona;
@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaDAO personaDao;
	
	@Override
	public Persona registrar(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.save(persona);
	}

	@Override
	public void modificar(Persona persona) {
		// TODO Auto-generated method stub
		personaDao.save(persona);
		
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		personaDao.deleteById(id);
	}

	@Override
	public Persona listarID(int id) {
		// TODO Auto-generated method stub
		return personaDao.findById(id).get();
	}

	@Override
	public List<Persona> listar() {
		// TODO Auto-generated method stub
		return personaDao.findAll();
	}

}
