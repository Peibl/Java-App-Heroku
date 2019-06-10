package com.example.app.models;

import java.util.Date;

public class Repair {

	private long idReparacion;
	private Date fechaIngreso;
	private Date fechaEgreso;
	private String tipo;
	private String Marca;
	private String PIN;
	private String Cliente;
	private long idCliente;
	private float presupuesto;
	private String comentarios;
	private String diagnostico;
	private float costo_reparacion;


	
	public long getIdReparacion() {
		return idReparacion;
	}



	public void setIdReparacion(long idReparacion) {
		this.idReparacion = idReparacion;
	}



	public Date getFechaIngreso() {
		return fechaIngreso;
	}



	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}



	public Date getFechaEgreso() {
		return fechaEgreso;
	}



	public void setFechaEgreso(Date fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getMarca() {
		return Marca;
	}



	public void setMarca(String marca) {
		Marca = marca;
	}



	public String getPIN() {
		return PIN;
	}



	public void setPIN(String pIN) {
		PIN = pIN;
	}



	public String getCliente() {
		return Cliente;
	}



	public void setCliente(String cliente) {
		Cliente = cliente;
	}



	public long getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}



	public float getPresupuesto() {
		return presupuesto;
	}



	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}



	public String getComentarios() {
		return comentarios;
	}



	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}



	public String getDiagnostico() {
		return diagnostico;
	}



	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}



	public float getCosto_reparacion() {
		return costo_reparacion;
	}



	public void setCosto_reparacion(float costo_reparacion) {
		this.costo_reparacion = costo_reparacion;
	}



	public Repair() {
		
	}
}
