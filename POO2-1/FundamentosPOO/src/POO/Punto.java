package POO;

public class Punto {
	public double x;
	public double y;
	
	public double distancia(Punto punto) {
		double distancia = Math.sqrt(Math.pow((x - punto.x),2) + Math.pow((y - punto.y),2));
		return distancia;
	}
	
	public Punto suma(Punto punto) {
		Punto result = new Punto();
		result.x = x + punto.x;
		result.y = y + punto.y;
		return result;
		
	}

}
