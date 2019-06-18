package com.example.app.models;

import javax.persistence.*;

/*fravinale (10/06/2019): 
 * las variables las puse en esp para que mantenga relación con la migración de la db Access.
 */

@Entity
@Table(name = "product", schema = "apolodb", catalog = "")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String marca;
    private String modelo;
    private double precio_compra;
    private double precio_venta;
    private Integer stock;
    private String proveedor;
    private String email_proveedor;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPrecio_compra() {
		return precio_compra;
	}


	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}


	public double getPrecio_venta() {
		return precio_venta;
	}


	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public String getProveedor() {
		return proveedor;
	}


	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}


	public String getEmail_proveedor() {
		return email_proveedor;
	}


	public void setEmail_proveedor(String email_proveedor) {
		this.email_proveedor = email_proveedor;
	}


	public Product() {
    }
    
}
