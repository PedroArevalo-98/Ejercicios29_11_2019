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
		if (cantidadActual > capacidadtaza) {
			capacidadtaza= cantidadActual-capacidadtaza; 
		}
	}
}
