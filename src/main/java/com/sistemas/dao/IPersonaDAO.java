package com.sistemas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.model.Persona;

public interface IPersonaDAO extends JpaRepository<Persona, Integer> {
	

}
