package com.mitocode.beans;

import java.util.List;

public class Pais {
	
	private String pais;
    private List<Ciudad> ciudades;
    
	public List<Ciudad> getCiudades() {
		return ciudades;
	}
	public void setCiudades(List<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}
