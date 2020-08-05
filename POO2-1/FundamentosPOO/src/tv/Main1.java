package tv;

public class Main1 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();
		
		tv1.encender();
		tv1.subirVolumen();
		tv1.subirVolumen();
		tv1.subirVolumen();
		tv1.subirVolumen();
		
		tv2 = tv1;
		tv2.subirVolumen();
		tv1.subirVolumen();
		
		System.out.println("Tv1 volumen: " + tv1.volumen);
		System.out.println("Tv2 volumen: " + tv2.volumen);

	}

}
