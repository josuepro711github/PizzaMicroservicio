package com.idat.pizza.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pizzas")
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPizza;
	private String nombrePizza;
	private String descripcion;
	
	public Pizza() {
		super();
	}

	public Pizza(Integer idPizza, String nombrePizza, String descripcion) {
		super();
		this.idPizza = idPizza;
		this.nombrePizza = nombrePizza;
		this.descripcion = descripcion;
	}

	public Integer getIdPizza() {
		return idPizza;
	}

	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}

	public String getNombrePizza() {
		return nombrePizza;
	}

	public void setNombrePizza(String nombrePizza) {
		this.nombrePizza = nombrePizza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
