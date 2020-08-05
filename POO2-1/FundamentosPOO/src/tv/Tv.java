package tv;

public class Tv {
	public boolean encendido;
	public int volumen;
	public int canal;
	
	public void apagar() {
		encendido = false;
	}
	public void encender() {
		encendido = true;
	}
	public void avanzarCanal() {
		if(encendido)
			canal++;
	}
	public void disminuirCanal() {
		if(encendido && canal > 0)
			canal--;
	}
	public void subirVolumen() {
		if(encendido && canal <=100)
			volumen++;
	}
	public void bajarVolumen() {
		if(encendido && volumen >=0)
			volumen--;
	}

}
