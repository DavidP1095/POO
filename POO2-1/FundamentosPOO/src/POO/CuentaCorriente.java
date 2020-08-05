package POO;

public class CuentaCorriente {
	
	public static int contador;
	
	public double saldo;
	
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
