package com.idat.pizza.service;

import java.util.List;

import com.idat.pizza.model.Pizza;

public interface PizzaService {
	
	List<Pizza> listar();
	
	Pizza obtenerId(Integer id);
	
	void guardar(Pizza pizza);
	
	void eliminar(Integer id);
	
	void actualizar(Pizza pizza);
	
}
