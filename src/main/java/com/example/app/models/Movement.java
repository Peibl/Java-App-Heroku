package com.example.app.models;

import java.util.Date;

public class Movement {

	private long idMovimiento;
	private long idReparacion;
	private Date fechamov;
	private String tipo;
	private String descripcion;
	
	
	public long getIdMovimiento() {
		return idMovimiento;
	}



	public void setIdMovimiento(long idMovimiento) {
		this.idMovimiento = idMovimiento;
	}



	public long getIdReparacion() {
		return idReparacion;
	}



	public void setIdReparacion(long idReparacion) {
		this.idReparacion = idReparacion;
	}



	public Date getFechamov() {
		return fechamov;
	}



	public void setFechamov(Date fechamov) {
		this.fechamov = fechamov;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Movement() {
		
	}
}
