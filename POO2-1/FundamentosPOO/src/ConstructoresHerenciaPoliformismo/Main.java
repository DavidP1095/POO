package ConstructoresHerenciaPoliformismo;

public class Main {
	
	public static void main(String[] args) {
		Persona pr1 = new Persona();
		pr1.setNombre("David");
		
		Persona pr2 = new Persona("Galo");
		pr2.setEdad(10);
		
		Persona pr3 = new Persona("David", "Pazmiño", 24);
		
		System.out.println(pr1.getNombre());
		System.out.println(pr2.getNombre());
		System.out.println(pr3.getNombre() +  " " + pr3.getApelido() + " " + pr3.getEdad());
		
		System.out.println("\n\nAuto: ");
		
		Auto a1 = new Auto(200);
		a1.setVelocidad(100);
		System.out.println(a1.getVelocidad());
	}

}
