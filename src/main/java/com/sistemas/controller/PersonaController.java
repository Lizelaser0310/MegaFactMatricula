package com.sistemas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PostUpdate;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemas.model.Persona;
import com.sistemas.service.IPersonaService;

@RestController
@RequestMapping({"", "/api/persona"})
public class PersonaController {

	@Autowired
	private IPersonaService service;
	
	   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<Persona>> listar() {

	        List<Persona> personas = new ArrayList<>();
	        personas = service.listar();

	        return new ResponseEntity<>(personas, HttpStatus.OK);
	    }
	    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> registrar(@Valid @RequestBody Persona personas) {
	        service.registrar(personas);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }

	    @PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> actualizar(@RequestBody Persona personas) {
	        service.modificar(personas);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }
	
	

}
