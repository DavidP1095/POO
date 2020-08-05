public class SupervisorTecnico extends Empleado{
    
    private int aniosTrabajados;

    public SupervisorTecnico(int aniosTrabajados, double salario) {
        super(salario);
        this.aniosTrabajados = aniosTrabajados;
    }

    public SupervisorTecnico(int aniosTrabajados, String identificador, double salario) {
        super(identificador, salario);
        this.aniosTrabajados = aniosTrabajados;
    }
    
    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }
    
    @Override
    public double getSalario(){
        double salario = super.getSalario();
        double aumento = 0;
        for(int i=0;i<aniosTrabajados;i++){
            aumento+=salario*0.05;
        }
        return salario+aumento;
    }
    
}