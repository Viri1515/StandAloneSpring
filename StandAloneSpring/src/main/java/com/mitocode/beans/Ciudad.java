package com.mitocode.beans;

public class Ciudad {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	private void init(){
		System.out.println("antes de inicializar el bean");
	}
	
	private void destroy(){
		System.out.println("bean a punto de ser destruido");
	}
	

	
}
