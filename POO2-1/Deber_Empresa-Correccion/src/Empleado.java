
public class Empleado {
    private String identificador;
    private double salario;

    public Empleado(double salario) {
        this.salario = salario;
    }

    public Empleado(String identificador, double salario) {
        this.identificador = identificador;
        this.salario = salario;
    }
    
    

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
    
}