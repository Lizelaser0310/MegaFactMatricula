package com.sistemas.dao;

import com.sistemas.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoDAO extends JpaRepository<Curso, Integer> {

}
