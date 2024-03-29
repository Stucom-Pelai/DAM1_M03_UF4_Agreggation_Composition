package model.composicion;

import java.util.Date;

public class LugarNacimiento {
	private String pais;
	private String hospitalNacimiento;
	private String direccion;
	private Date fNacimiento;
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public LugarNacimiento() {
		this.pais = "Desconocido";
		this.hospitalNacimiento = "Desconocido";
		this.direccion = "Desconocida";
		this.fNacimiento = null;
	}
	public LugarNacimiento(String pais, String hospitalNacimiento, String direccion, Date fNacimiento) {
		super();
		this.pais = pais;
		this.hospitalNacimiento = hospitalNacimiento;
		this.direccion = direccion;
		this.fNacimiento = fNacimiento;
	}
	public String getHospitalNacimiento() {
		return hospitalNacimiento;
	}
	public void setHospitalNacimiento(String hospitalNacimiento) {
		this.hospitalNacimiento = hospitalNacimiento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	@Override
	public String toString() {
		return "Pais: "+this.pais+"; Hospital de Nacimiento: "+this.hospitalNacimiento + "; Direccion: "+ this.direccion+"; Fecha Nacimiento: " + this.fNacimiento;
	}
}
