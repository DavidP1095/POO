
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static ArrayList<Libro> libros = new ArrayList<>();
    
    public static void agregarLibro(Libro libro){
        libros.add(libro);
    }
    
    public static void actualizarInventario(int codigo, int cantidad){
        Libro libro  = getLibro(codigo);
        if(libro !=null){
            int cantidadActual = libro.getCantidad();
            libro.setCantidad(cantidadActual + cantidad);
        }
    }
    
    public static Libro getLibro(int codigo){
        for(int i=0;i<libros.size();i++){
            Libro libro = libros.get(i);
            if(libro.getCodigo() == codigo)
                return libro;
        }
        return null;
    }
    
    public static void buscarcodigo(ArrayList<Libro> libros) {
	Scanner entrada = new Scanner (System.in);
	System.out.println("Solicite el codigo del libro: ");
	int codigoingresado = entrada.nextInt();
	for (int i=0;i<libros.size();i++) {
            if (codigoingresado == libros.get(i).getCodigo()) {
                System.out.println(libros.get(i));	
            }		
	}
    }
    
   public static void comprarLibro () {
	Scanner entrada = new Scanner (System.in);
	System.out.println("Solicite el codigo del libro: ");
	int codigoingresado = entrada.nextInt();
	int cantidad;
	for (int i=0;i<libros.size();i++) {
            if (codigoingresado == libros.get(i).getCodigo()) {
		cantidad = libros.get(i).getCantidad();
                    if(cantidad > 1) {
			cantidad -= 1;
			System.out.println("Gracias por su compra.");
			libros.get(i).getCantidad();
			actualizar(libros);
                    }
                    else {
			cantidad = 0;
			System.out.println("Gracias por su compra.");
			System.out.println("El libro que solicitó se ha terminado.");
			libros.get(i).setCantidad(cantidad);
			actualizar(libros);
                    }
            }
	}
    }
		
    public static void actualizar(ArrayList<Libro> li) {
	for (int i=0;i<li.size();i++) {
            System.out.println(li.get(i));
	}
    }
		
    public static void librosMasCaros (ArrayList<Libro> li) {
	System.out.println("LIBROS MAS COSTOSOS.");
    } 
    
    public static void main(String[] args){
        
    Libro b1 = new Libro(2633, 1, "Cien años de soledad.", 28.15);
	Libro b2 = new Libro(7633, 2, "La iliada.", 43.99);
	Libro b3 = new Libro(2911, 3, "Las palabras que formaron un nudo en mi garganta.",80.70);
	Libro b4 = new Libro(8956, 4, "La vida que me diste." ,90.00);
	Libro b5 = new Libro(9076, 5, "A la cuenta de tres." ,67.00);
        
        libros.add(b1);
        libros.add(b2);
        libros.add(b3);
        libros.add(b4);
        libros.add(b5);
        
    }
}