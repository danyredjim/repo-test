package com.pathvariable_param_body.path_otros.models;



public class Thing {

	private Long codThing;	
	
	private String nombre;
	
	
	
	public Thing() {

	}

	public Thing(Long codThing, String nombre) {
		super();
		this.codThing = codThing;
		this.nombre = nombre;
	}

	
	
	public Long getCodThing() {
		return codThing;
	}

	public void setCodThing(Long codThing) {
		this.codThing = codThing;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
