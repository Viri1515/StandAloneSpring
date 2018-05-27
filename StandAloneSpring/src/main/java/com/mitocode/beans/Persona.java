package com.mitocode.beans;

public class Persona {
	
	private int id;
	private String name;
	private String 	apodo;
	private Pais pais;
	private Ciudad ciudad;
	
	private void init(){
		System.out.println("antes de inicializar el bean");
	}
	
	private void destroy(){
		System.out.println("bean a punto de ser destruido");
	}
	
	public int getId() {
		return id;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
	}
