package com.mitocode.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {

	@Value("Hola desde spring con anotaciones mo :)")
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	} 
	
	
}
