
public class Main {

    
    public static void main(String[] args) {
        Empleado ofc1 = new Oficinista("1", 500);
        Empleado ofc2 = new Oficinista("2", 500);
        
        Empleado st1 = new SupervisorTecnico(2, "3", 1000);
        Empleado st2 = new SupervisorTecnico(4, "4", 1000);
        
        Empleado grt1 = new Gerente(100, 2, "5", 2000);
        
        System.out.println(ofc1.getSalario());
        System.out.println(ofc2.getSalario());
        
        System.out.println(st1.getSalario());
        System.out.println(st2.getSalario());
        
        System.out.println(grt1.getSalario());
        
        Empresa empresa = new Empresa();
        
        empresa.contratar(ofc1);
        empresa.contratar(ofc2);
        empresa.contratar(st1);
        empresa.contratar(st2);
        empresa.contratar(grt1);
        
        
        System.out.println(empresa.totalEmpleados());
        System.out.println(empresa.diaDePago());
    }
    
}