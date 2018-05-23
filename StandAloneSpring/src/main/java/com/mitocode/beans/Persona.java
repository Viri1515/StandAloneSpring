package com.mitocode.beans;

public class Persona {
	
	private int id;
	private String name;
	private String 	apodo;
	
	public Persona(int id, String name,String apodo){
		this.id=id;
		this.name=name;
		this.apodo=apodo;
	}
	
	public Persona(int id){
		this.id=id;
	}
	
	public Persona(String apodo){
		this.apodo=apodo;
	}
	
	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	
	public String getApodo() {
		return apodo;
	}

	
}
