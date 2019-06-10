package com.example.app.models;

public class Invoice_Item {

	private long idFactura;
	private long idItem;
	private String Modelo;
	private Integer cantidad;
	private float precio_compra;
	private float precio_unitario;
	private float precio_total;
	private float dto_aplicado;
	private float monto_dto;
	
	public Invoice_Item() {
		
	}

	public long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(long idFactura) {
		this.idFactura = idFactura;
	}

	public long getIdItem() {
		return idItem;
	}

	public void setIdItem(long idItem) {
		this.idItem = idItem;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(float precio_compra) {
		this.precio_compra = precio_compra;
	}

	public float getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(float precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public float getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(float precio_total) {
		this.precio_total = precio_total;
	}

	public float getDto_aplicado() {
		return dto_aplicado;
	}

	public void setDto_aplicado(float dto_aplicado) {
		this.dto_aplicado = dto_aplicado;
	}

	public float getMonto_dto() {
		return monto_dto;
	}

	public void setMonto_dto(float monto_dto) {
		this.monto_dto = monto_dto;
	}
	
	
}
