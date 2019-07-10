package com.pruebaindra.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="usuario")
@SessionScoped
public class Usuario {
	
	private String nombre;
	private String mensaje;

	
	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String validarNombre() {
		
		if(this.nombre=="maria") {
			this.mensaje="nombre invalido";
		}
		return this.mensaje;
	}
	

}
