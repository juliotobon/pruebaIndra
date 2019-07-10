package com.pruebaindra.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="calculo")
@SessionScoped
public class Calculo {
	
	private int numeroEntrada;
	private int resultado;
	private String mensaje;
	public Calculo() {
		
	}
	public int getNumeroEntrada() {
		return numeroEntrada;
	}
	public void setNumeroEntrada(int numeroEntrada) {
		this.numeroEntrada = numeroEntrada;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public void validar () {
		
		if (this.numeroEntrada<50 || this.numeroEntrada>500) {
			
			this.mensaje="Número invalido, debe ingresar un número entre 50 y 500";
	
		}else {
		calcular();
		}
	}
	
	public void calcular() {
		int suma=0;
		for (int i=0; i<=this.numeroEntrada; i++) {
			if (i%2==0) {
				suma=suma+i;			
			}
			 
		}
		
		this.resultado=suma;
		this.mensaje="Resultado=" + this.resultado;
	}
	
	
}
