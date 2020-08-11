
public class Libro {
    private String Nombre;
	private String Autor;
	private int AnioPublicacion;
	private String Editorial;
	private int ISBN;
	private double Valor;
	private double Desc = 20;
	
	
	public Libro(String nombre, double valor) {
		super();
		Nombre = nombre;
		Valor = valor;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getAnioPublicacion() {
		return AnioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		AnioPublicacion = anioPublicacion;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		Valor = valor;
	}
	
	public double getValor1() {
		double total_pagar = 0;
		total_pagar = Valor * 0.09 - Desc / 100 ;
		
		return Valor + total_pagar;
	}
}
