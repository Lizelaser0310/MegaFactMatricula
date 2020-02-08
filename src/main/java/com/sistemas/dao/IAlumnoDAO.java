package com.sistemas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.model.Alumno;

public interface IAlumnoDAO extends JpaRepository<Alumno,Integer> {

}
