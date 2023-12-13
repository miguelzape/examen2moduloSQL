package parteIV.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_Contrato")
public class Contrato {
	
	
	@Id
	@SequenceGenerator(name="CONTRATOMZP", sequenceName="CONTRATO_GEN", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONTRATOMZP")
	private long id;
	private String nombreCliente;
	private Date fechaInicio;
	private Date fechaFin;
	private long importe;
	
	// constructores
	public Contrato() {
		super();
		
	}

	
	public Contrato(String nombreCliente, Date fechaInicio, Date fechafin, long importe) {
		super();
		this.nombreCliente = nombreCliente;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechafin;
		this.importe = importe;
	}


	
	
	// metodos get y set
	public String getNombreCliente() {
		return nombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}


	public Date getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public Date getFechafin() {
		return fechaFin;
	}


	public void setFechafin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}


	public long getImporte() {
		return importe;
	}


	public void setImporte(long importe) {
		this.importe = importe;
	}


	public long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Contrato [id=" + id + ", nombreCliente=" + nombreCliente + ", fechaInicio=" + fechaInicio
				+ ", fechafin=" + fechaFin + ", importe=" + importe + "]";
	}
	
	
	
	
	
	
	
}








