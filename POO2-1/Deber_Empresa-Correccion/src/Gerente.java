
public class Gerente extends SupervisorTecnico{
    private double viaticos;

    public Gerente(double viaticos, int aniosTrabajados, String identificador, double salario) {
        super(aniosTrabajados, identificador, salario);
        this.viaticos = viaticos;
    }

    public double getViaticos() {
        return viaticos;
    }

    public void setViaticos(double viaticos) {
        this.viaticos = viaticos;
    }
    
    
    
    @Override
    public double getSalario(){
        double salario = super.getSalario();
        for(int i=0;i<getAniosTrabajados();i++){
            salario += viaticos;
        }
        return salario;
    }
    
    
}
