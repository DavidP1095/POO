package TareaVirtual1;

import java.util.Scanner;

public class DeberEnum {
    enum Piedra {
        CALIZA(1200), MARMOL(1423.55), PIZARRA(1325), CUARZITA(1466.22);
         double peso;
        private Piedra(double peso){
            this.peso = peso;
            
        }
        public double damePeso(){
            return peso;
            
        }
    }
    public void mostrar (String piedra){
        Piedra piedra2=Enum.valueOf(Piedra.class, piedra);
        System.out.println("Piedra"+ piedra2);
        System.out.println("Peso"+ piedra2.damePeso());
                
        
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre de la piedra:");
        String piedra = entrada.next().toUpperCase();
        DeberEnum n = new DeberEnum();
        n.mostrar(piedra);
    }
}