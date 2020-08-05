package ModificadoresAcceso;


public class CuentaCorriente {
	
	public static int contador = 1000;
	
	public static void sumarContador() {
		contador += 100;
	}
	
	double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void retirar(double dinero) {
		saldo -= dinero;
	}
	
	public void depositar(double dinero) {
		saldo += dinero;
	}

}
