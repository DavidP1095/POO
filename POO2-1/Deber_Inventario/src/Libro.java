
public class Libro {
	
    private int codigo;
    private int cantidad;
    private String titulo;
    private double precio;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Libro(int codigo, int cantidad) {
        super();
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public Libro(int codigo, int cantidad, String titulo, double precio) {
        super();
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.titulo = titulo;
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        String x = "Codigo: "+codigo+
                "\nCantidad de libros: "+cantidad+
                "\nTitulo: "+titulo+
                "\nPrecio: "+precio;
        return x;
    }
}