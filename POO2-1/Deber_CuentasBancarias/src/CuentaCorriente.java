
public class CuentaCorriente extends CuentaBancaria{
    
    @Override
    public double deposito(double deposito, double monto){
        double aumento;
        if(monto <= 1000){
            aumento = monto *0.01;
            deposito += (monto + aumento);
        }
        
        return deposito;
    }
}