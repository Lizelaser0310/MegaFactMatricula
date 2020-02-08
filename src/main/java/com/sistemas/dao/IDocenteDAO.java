package com.sistemas.dao;

import com.sistemas.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDocenteDAO extends JpaRepository<Docente,Integer> {
}
