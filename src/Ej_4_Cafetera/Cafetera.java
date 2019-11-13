package Ej_4_Cafetera;

public class Cafetera {

	private int capacidadMaxima,cantidadActual;
	
	Cafetera (){
		this.cantidadActual= 0;
		this.capacidadMaxima= 1000;
	}
	Cafetera (int capacidadMaxima){
		this.cantidadActual=capacidadMaxima;
	}
	Cafetera (int capacidadMaxima, int cantidadActual){
		this.cantidadActual=cantidadActual;
		this.capacidadMaxima=capacidadMaxima;
		if (cantidadActual > capacidadMaxima) {
			this.cantidadActual=capacidadMaxima;
		}
	}
	public void llenarCafetera() {
		this.cantidadActual = capacidadMaxima;
		
	}
	public int servirTaza (int capacidadtaza) {
		int cantidadtaza=0;
		if (cantidadActual > capacidadtaza) {
			cantidadtaza= cantidadActual-capacidadtaza; 
			 System.out.println("No cabe en la taza, la cantidad que sobra es");
			 return cantidadtaza;
		}else { 
			cantidadtaza=cantidadActual;
			return cantidadtaza;
		}
	}
	public void vaciarCafetera() {
		cantidadActual=0;
	}
	public void agregarCafe(int cantidad) {
		
	}
}
