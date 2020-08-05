	enum Transporte{
		COCHE(60), CAMION(50), AVION(600), TREN(70), BARCO(20);
		private int velocidad;
		
		Transporte(int s){velocidad=s;}
		
		int getVelocidad() {return velocidad;}
	}
public class Enumerador {
		
	public static void main(String[] args) {
		
		Transporte tp;
		System.out.println("La velocidad t�pica para un avi�n es: " +
		Transporte.AVION.getVelocidad()+ "millas de transporte. \n");
		
		System.out.println("Todas las velocidades de transporte: ");
		for (Transporte t:Transporte.values())
			System.out.println(t+ ": velocidad t�pica es "+t.getVelocidad()+"millas por hora.");
	}


	}


