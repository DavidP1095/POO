package ConstructoresHerenciaPoliformismo;

public class Persona {
	private String nombre;
	private String apelido;
	private int edad;
	
	public Persona() {
		System.out.println("Persona()");
	}
	
	public Persona(String nombre) {
		System.out.println("Persona(string nombre");
		this.nombre = nombre;
	}
	
	public Persona(int edad) {
		System.out.println("Persona(string nombre");
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apelido = apellido;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

}
