
public class CD {
    private String Titulo;
    private String Interprete;
    private int AnioPublicacion;
    private double ValorCD;
    private double Desc = 10;
    
    public CD(String titulo, double valorCD) {
    	super();
    	Titulo = titulo;
    	ValorCD = valorCD;
    }
	
    public String getTitulo() {
		return Titulo;
	}
    
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public String getInterprete() {
		return Interprete;
	}
	
	public void setInterprete(String interprete) {
		Interprete = interprete;
	}
	
	public int getAnioPublicacion() {
		return AnioPublicacion;
	}
	
	public void setAnioPublicacion(int anioPublicacion) {
		AnioPublicacion = anioPublicacion;
	}
	
	public double getValorCD() {
		return ValorCD;
	}
	
	public void setValorCD(double valorCD) {
		ValorCD = valorCD;
	}
	
	public double getValorcd1() {
        double total_pagar = 0;
        total_pagar = ValorCD * 0.09 - Desc / 100 ;
		
        return ValorCD + total_pagar;
    }
}    