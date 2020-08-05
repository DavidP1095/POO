package TareaVirtual1;

import java.util.Scanner;

public class Fecha {
	int año;
    int mes;
    int dia;
    
    public void normalizar() {
    	if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && año> 0) {
    			if((dia>0 && dia<=31 )&& (mes ==1 || mes ==3 ||mes ==5 || mes ==7 || mes ==8 || mes ==10 || mes ==12)){
    			}else if((dia>0 && dia<=30) && (mes==4 || mes==6 ||mes ==9 ||mes ==11)) {
    			}else if((dia>0 && dia<=28) && mes == 2) {
    			}else {
    			System.out.println("Fecha Incorrecta");
    			System.exit(mes);
    			System.exit(dia);
    			System.exit(año);
    			}
    			}else {
    			System.out.println("Fecha Incorrecta");
    			System.exit(mes);
    			System.exit(dia);
    			System.exit(año);
    			}
    			}
    public void adelantar() {
		if((dia==30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)){
	        dia = 1;
	        mes +=1;
	    }
		else if (dia==31 && (mes == 1 || mes == 3 || mes == 5 || mes == 8 || mes == 10)){
	    	dia = 1;
	        mes +=1;	
	    }else if (dia==31 && mes ==12 ) {
	    	dia =1;
	    	mes=1;
	    	año+=1;
	    }else if(dia==28 && mes == 2) {
	    	dia=1;
	    	mes+=1;
	    }else {
	    	dia+=1;
	    }
	}
	public void Imprimir(){
	    System.out.println("dia: " + dia + " mes: " + mes + " año: " + año); 
	}
	public void reiniciar() {
		dia=0;
		mes=0;
		año=0;
	}
	
	public int dia(int mes){
	    int nuDia=0;
	    if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
	        nuDia=30;
	    }else if (mes == 1 || mes == 3 || mes == 5 || mes == 8 || mes == 10 || mes == 12){
	        nuDia=31;
	    }else if (mes == 2){
	        nuDia=28;
	    }
	    
	    return nuDia;
	}
	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    Fecha fecha = new Fecha();
	    System.out.println("menú");
	    System.out.println("ingrese una fecha");
	    System.out.println("ingrese dia: ");
	    fecha.dia = entrada.nextInt();
	    System.out.println("ingrese mes: ");
	    fecha.mes = entrada.nextInt();
	    System.out.println("ingrese año: ");
	    fecha.año = entrada.nextInt();
	    fecha.normalizar();	    
	    fecha.adelantar();
	    fecha.Imprimir();
	    fecha.reiniciar();
	    System.out.println("ingrese una fecha");
	    System.out.println("ingrese dia: ");
	    fecha.dia = entrada.nextInt();
	    System.out.println("inrese mes: ");
	    fecha.mes = entrada.nextInt();
	    System.out.println("ingrese año: ");
	    fecha.año = entrada.nextInt();
	    fecha.adelantar();
	    fecha.Imprimir();
	    fecha.normalizar();

}
}