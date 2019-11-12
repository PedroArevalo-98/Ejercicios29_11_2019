package Ej_1_DVD;

public class DVDCine {

	private String descripcion;
	private boolean genThriller;
	private boolean resumen;
	private int duracion;
	
	DVDCine (String descripcion, boolean genThriller, boolean resumen, int duracion){
		this.descripcion=descripcion;
		this.genThriller=genThriller;
		this.resumen=resumen;
		
	}

	public String muestraDVDCine() {
		descripcion="UN FINAL MADE IN HOLLYWOOD";
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean esThriller() {
		return genThriller;
	}

	public void setGenThriller(boolean genThriller) {
		this.genThriller = genThriller;
	}

	public boolean tieneResumen() {
		return resumen;
	}

	public void setResumen(boolean resumen) {
		this.resumen = resumen;
	}

	public int muestraDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}
