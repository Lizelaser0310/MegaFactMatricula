package com.sistemas.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCurso;
	
	@Column(name = "abreviatura", nullable = false, length = 10)
	private String abreviatura;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "costo", nullable = false, precision = 2)
	private BigDecimal costo;
	
	@Column(name = "credito", nullable = false)
	private int credito;
	
	@Column(name = "descripcion", nullable = false, length = 100)
	private String descripcion;
	
	@Column(name = "estado",nullable = false)
	private int estado;

	@Column(name = "tiempo_duracion", nullable = false, length = 255)
	private String tiempo_duracion;

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public int getCredito() {
		return credito;
	}

	public void setCredito(int credito) {
		this.credito = credito;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getTiempo_duracion() {
		return tiempo_duracion;
	}

	public void setTiempo_duracion(String tiempo_duracion) {
		this.tiempo_duracion = tiempo_duracion;
	}
	
	
	

}
