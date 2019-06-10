package com.example.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*fravinale (10/06/2019): 
 * las variables las puse en esp para que mantenga relación con la migración de la db Access.
 */

/*@Entity
@Table(name = "product", schema = "apolodb", catalog = "")
*/
public class Client {
  /*  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    */
	private long idcli;
	private String nombre;
	private String apellido;
	private String []telefono; //deberían ser 2
	private String email;
	private String provincia;
	private String localidad;
	private String ciudad;
	private String cod_postal;
	private String direccion_laboral;
	private String direccion_comercial;
	private String situacion_fiscal; // SA, R.I, SRL, etc..
	private String cuit;
	private String comentarios; // 255 chars en la app actual
	
	public long getIdcli() {
		return idcli;
	}

	public void setIdcli(long idcli) {
		this.idcli = idcli;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String[] getTelefono() {
		return telefono;
	}

	public void setTelefono(String[] telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(String cod_postal) {
		this.cod_postal = cod_postal;
	}

	public String getDireccion_laboral() {
		return direccion_laboral;
	}

	public void setDireccion_laboral(String direccion_laboral) {
		this.direccion_laboral = direccion_laboral;
	}

	public String getDireccion_comercial() {
		return direccion_comercial;
	}

	public void setDireccion_comercial(String direccion_comercial) {
		this.direccion_comercial = direccion_comercial;
	}

	public String getSituacion_fiscal() {
		return situacion_fiscal;
	}

	public void setSituacion_fiscal(String situacion_fiscal) {
		this.situacion_fiscal = situacion_fiscal;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public boolean isFlag_conflictivo() {
		return flag_conflictivo;
	}

	public void setFlag_conflictivo(boolean flag_conflictivo) {
		this.flag_conflictivo = flag_conflictivo;
	}

	private boolean flag_conflictivo; //Si, No
	
	public Client() {
		
	}
    
}
