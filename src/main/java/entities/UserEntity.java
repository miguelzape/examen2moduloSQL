package entities;

import java.util.Date;

public class UserEntity {
	
	private String Nombre;
	private String Apellidos;
	private Date FechaAlta;
	
	
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public Date getFechaAlta() {
		return FechaAlta;
	}


	public void setFechaAlta(Date fechaAlta) {
		FechaAlta = fechaAlta;
	}
	
	
	
	
	

}
