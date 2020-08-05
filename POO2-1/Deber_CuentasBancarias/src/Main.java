
public class Main {

    
    public static void main(String[] args) {
   
        CuentaBancaria Cuenta1 = new CuentaBancaria();
        CuentaBancaria Cuenta2 = new CuentaCorriente();
        CuentaAhorro Cuenta3 = new CuentaAhorro();
        
        System.out.println(Cuenta2.deposito(5000,1000));
        System.out.println(Cuenta3.deposito(5000,900));
        
        
        
    }
    
}