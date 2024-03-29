package model.agregacion;

import java.util.ArrayList;

import model.composicion.LugarNacimiento;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	//Relación de agregación.
	private ArrayList<Mascota> mascotas;
	//Relación de composición
	private LugarNacimiento lugar;
	
	

	public Persona(String dni, String nombre, String apellido, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.lugar = new LugarNacimiento();
		
	}
	public Persona(String dni, String nombre, String apellido, int edad, ArrayList<Mascota> mascotas) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.mascotas = mascotas;
		this.lugar = new LugarNacimiento();
	}
	public LugarNacimiento getLugar() {
		return lugar;
	}
	public void setLugar(LugarNacimiento lugar) {
		this.lugar = lugar;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}
	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	
}
