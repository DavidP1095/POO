
public class SumaVectores {

	public static void main(String[] args) {
		int [] v1 = new int[] {
				2, 56, 3, 12, 41, 9, 36, 0, 14, 7
		};
		
		int [] v2 = new int[] {
				5, 24, 89, 23, 17, 8, 33, 11, 4, 5	
		};
		
		int totalV1 = 0, totalV2 = 0;
		
		for(int i=0; i<v1.length; i++) {
			totalV1 += v1[i];
			totalV2 += v2[i];			
		}
		
		System.out.println("El total del Vector 1 es: " + totalV1);
		System.out.println("El total del Vector 2 es: " + totalV2);
		
		if(totalV1 > totalV2) {
			System.out.println("Vector 1 es mayor: " + totalV1);		
		} else if (totalV2 > totalV1) {
			System.out.println("Vector 2 es mayor: " + totalV2);
		} else {
			System.out.println("Vector 1 y 2 son iguales: " + totalV2);
		}
		
		
	}

}
