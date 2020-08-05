
public class CuentaBancaria {
    protected String propietario;
    protected double saldo;
    //protected double monto;

    public String getPropietario() {
        return propietario;
    }

    public double getSaldo() {
        return saldo;
    }

    
    public double deposito(double deposito, double monto){
        deposito+=monto;
        return deposito;
    }
    
    public double retiro(double monto){
        saldo-=monto;
        return saldo;
    }
    
    
}