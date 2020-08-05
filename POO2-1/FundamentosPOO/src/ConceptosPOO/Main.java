package ConceptosPOO;

//clase
//objeto, instancia -> objeto -> instancia -> variables por referencia
//herencia, polimorfismo, abstracción, encapsulamiento
//variables de clase -> variables y metodos estaticos
//variables primitivas (int, float...)


public class Main {
	
	int contador;
	static int suma = 100;
	
	public void contar() {
		contador++;
	}
	
	public static void sumar() {
		suma++;
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.contador = 100;
		main.contar();
		
		Main.suma = 100;
		// O
		suma = 100;
		Main.sumar();
		// O
		sumar();
		

	}

}
