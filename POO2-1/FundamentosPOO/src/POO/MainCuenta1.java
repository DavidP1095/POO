package POO;

//clase
//objeto, instancia -> objeto -> instancia -> variables por referencia
//herencia, polimorfismo, abstracción, encapsulamiento
//variables de clase -> variables y metodos estaticos
//variables primitivas (int, float...)

public class MainCuenta1 {
	void sumarContadorMain() {
		CuentaCorriente.contador += 100;
		sumarContadorMain1();
	}
	
	static void sumarContadorMain1() {
		CuentaCorriente.contador += 100;
		MainCuenta1 main = new MainCuenta1();
		main.sumarContadorMain();
	}

	public static void main(String[] args) {
		
		MainCuenta1 main = new MainCuenta1();
		main.sumarContadorMain();
		
		MainCuenta1.sumarContadorMain1();
		sumarContadorMain1();
		
		
		
		CuentaCorriente.contador = 100;
		//CuentaCorriente.saldo = 100;
		CuentaCorriente cta = new CuentaCorriente();
		cta.saldo = 100;

	}

}
