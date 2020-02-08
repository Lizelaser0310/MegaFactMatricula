package com.sistemas.service;

import com.sistemas.dao.IDocenteDAO;
import com.sistemas.model.Docente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DocenteServiceImpl implements IDocenteService {

    @Autowired
    private IDocenteDAO dao;

    @Override
    public Docente registrar(Docente docente) {
        return dao.save(docente);
    }

    @Override
    public void modificar(Docente docente) {
        dao.save(docente);
    }

    @Override
    public void eliminar(int id) {
    	dao.deleteById(id);
    }

    @Override
    public Docente listarID(int id) {
        return dao.findById(id).get();
    }

    @Override
    public List<Docente> listar() {
        return dao.findAll();
    }
}
