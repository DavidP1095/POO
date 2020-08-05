
public class MayorArreglo {

	public static void main(String[] args) {
		int [] numeros = new int[] {
				1, -56, 8, 156, -7, 0, 63, 89, -7
		};
		
		int num=numeros[0];
		int posicion = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (num < numeros[i]) {
				num=numeros[i];
				posicion=i;
				
			}
		}
		
		System.out.println("EL numero mayor es: " +num);
		System.out.println("La posicion es: " +posicion);

	}

}
