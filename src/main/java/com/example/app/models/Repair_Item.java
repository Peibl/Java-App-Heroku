package com.example.app.models;

public class Repair_Item {

	private long idReparacion;
	private long idReparacion_item;
	private String tipo;
	private String modelo;
	private String marca;	
	private String PIN;
	private String diagnostico;
	private String comentario;
	private String estado;
	private float costo;
	private float presupuesto;
	
	
	public long getIdReparacion() {
		return idReparacion;
	}

	public void setIdReparacion(long idReparacion) {
		this.idReparacion = idReparacion;
	}



	public long getIdReparacion_item() {
		return idReparacion_item;
	}



	public void setIdReparacion_item(long idReparacion_item) {
		this.idReparacion_item = idReparacion_item;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getPIN() {
		return PIN;
	}



	public void setPIN(String pIN) {
		PIN = pIN;
	}



	public String getDiagnostico() {
		return diagnostico;
	}



	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}



	public String getComentario() {
		return comentario;
	}



	public void setComentario(String comentario) {
		this.comentario = comentario;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public float getCosto() {
		return costo;
	}



	public void setCosto(float costo) {
		this.costo = costo;
	}



	public float getPresupuesto() {
		return presupuesto;
	}



	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
	}


	public Repair_Item() {
		
	}
}
