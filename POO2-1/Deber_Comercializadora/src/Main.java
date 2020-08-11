
public class Main {

   
    public static void main(String[] args) {
        Libro lbr1 = new Libro("Cien años de soledad", 17);
	Libro lbr2 = new Libro("A la cuenta de tres", 15);
		
	CD Cd1 = new CD("Misadventures", 22);
	CD Cd2 = new CD("Collide with the Sky", 20);

       
	System.out.println("EL LIBRO Cien años de soledad TIENE UN PRECIO DE:" + lbr1.getValor1() +  "$");
	System.out.println("EL LIBRO A la cuenta de tres CUESTA : " + lbr2.getValor1() +  "$"); 
		
	System.out.println();
		
	System.out.println("EL VALOR DEL CD DE Misadventures ES :" +  Cd1.getValorcd1() +  "$");
	System.out.println("EL VALOR DEL CD DE Collide with the Sky ES : "  + Cd2.getValorcd1() +  "$");
    }
    
}
