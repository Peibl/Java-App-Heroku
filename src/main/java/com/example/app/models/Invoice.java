package com.example.app.models;

import java.util.Date;

public class Invoice {

	private long idFact;
	private Date fecha;
	private String cliente;
	private long idCliente;
	private String comentario;
	
	public Invoice() {
		
	}

	public long getIdFact() {
		return idFact;
	}

	public void setIdFact(long idFact) {
		this.idFact = idFact;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
}
