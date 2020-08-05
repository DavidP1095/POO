import java.util.Scanner;

public class Arreglo {
	public static void ordenarArreglo (int s[], int LIMITE) {
		int i, j, aux;
        for (i = 0; i < s.length - 1; i++) {
        	for (j = 0; j < s.length - i - 1; j++) {
            	if (s[j + 1] < s[j]) {
                	aux = s[j + 1];
                    s[j + 1] = s[j];
                    s[j] = aux;
                }
            }
        }
	}
	
	
	//metodo que muestra los datos del vector por consola
	public static void mostrarArreglo(int s[], int LIMITE) {
		for (int indice = 0; indice < LIMITE; indice++) {
			System.out.println( + indice + ": " + s[indice]);
			
		}
	}
	
	// metodo que ingresa datos por teclado en el vector
	public static void ingresarArreglo(int s[], int LIMITE) {
		Scanner entrada = new Scanner(System.in);
		int indice, numero;
		for (indice = 0; indice < LIMITE; indice++)
		{
			System.out.println("INGRESE DATO EN CASILLA " + indice + ": ");
			numero = entrada.nextInt();
			s[indice] = numero; //graba el arreglo
			//s[indice] = entrada.nextInt(); metodo abreviado
		}
	}
	
	//llenar datos al vector con numeros aleatorios entre 0 y 100
	public static void cargarArreglo (int s[], int LIMITE) {
		for(int i=0; i<s.length;i++) {
			int aleatorio = (int) (Math.random()*10)+1;
			s[i] = aleatorio;
		}
		
	}
	
	public static void consultarDato (int s[]) {
		Scanner entrada = new Scanner(System.in);
		boolean encontrado = false;
		int posicion = -1, indice = 0;
		int dato_buscar;
		System.out.println("CONSULTA DE DATOS INDIVIDUAL");
		System.out.println("----------------------------\n");
		System.out.println("INGRESE DATO A BUSCAR: ");
		dato_buscar = entrada.nextInt();
		while(indice < s.length && encontrado == false) {
			if (s[indice] == dato_buscar) {
				posicion = indice;
				encontrado = true;
			}
			indice++;
		}
		if (encontrado == true)
			System.out.println("EL DATO " + dato_buscar + " SE ENCUENTRA EN CASILLA " + posicion);
		else
			System.out.println("EL DATO NO SE ENCUENTRA EN EL VECTOR...");
	}
	
	public static void quiebreDeControl (int s[]) {
		System.out.println("\nQUIEBRE DE CONTROL");
		int anterior = s[0];
		int indice = 0, contador = 0;
		while (indice < s.length) {
			if (anterior == s[indice]) {
				contador++;
			}
			else {
				System.out.println("EL NUEMRO " + anterior + " SE REPITIO " + contador + " VECES...");
				anterior = s[indice];
				contador = 1;
			}	
			indice++;
		}
		System.out.println("EL NUEMRO " + anterior + " SE REPITIO " + contador + " VECES...");
	}
	
	public static void menu(int s[], int LIMITE) {
		int opcion;
		Scanner in = new Scanner(System.in);
		do {
		System.out.println("MENU PRINCIPAL");
		System.out.println("**************");
		System.out.println("1. CARGAR VECTOR");
		System.out.println("2. ORDENAR VECTOR");
		System.out.println("3. MOSTRAR VECTOR");
		System.out.println("4. CONSULTAR DATOS INDIVIDUALES");
		System.out.println("5. QUIEBRE DE CONTROL");
		System.out.println("6. SALIR");
		System.out.println("DIGITE OPCION: ");		
		opcion = in.nextInt();
		
		switch (opcion) {
			case 1: cargarArreglo(s,LIMITE);break;
			case 2: ordenarArreglo(s,LIMITE);break;
			case 3: mostrarArreglo(s,LIMITE);break;
			case 4: consultarDato(s);break;
			case 5: quiebreDeControl(s);break;
			case 6: break;
			default: System.out.println("Opcion no reconocida."); break;
		}
		}while(opcion !=6);
	}
	
	public static void main(String[] args) {
		// creacion del vector
		final int MAX = 10; //final sirve para definir una constante
		int [] sueldos;
		sueldos = new int[MAX];
		menu (sueldos, MAX);
		//ingresarArreglo(sueldos, MAX);
		/*cargarArreglo(sueldos, MAX);// llamada al metodo ingresar y enviar el vector como parametro
		ordenarArreglo(sueldos, MAX);
		mostrarArreglo(sueldos, MAX);//llamada al metodo para mostrar los datos del vector
		*/

	}

}
