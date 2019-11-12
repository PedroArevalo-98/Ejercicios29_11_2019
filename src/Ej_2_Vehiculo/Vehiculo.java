package Ej_2_Vehiculo;

public class Vehiculo {
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
Vehiculo (String modelo){
	
	this.modelo=modelo;

}

public void setpotencia (double potencia) {
	this.potencia = potencia;
}
public void setcRuedas (boolean cRuedas) {
	this.cRuedas = cRuedas;
}


public  double getpotencia () {
	return potencia;
}
public boolean getcRuedas () {
	return cRuedas;
}

void Imprimirdatos () {
	String texto;
	if (cRuedas==true) {
		texto="tiene traccion";
	}else {
		texto="no tiene tracción";
	} System.out.println("El coche tiene el modelo " +modelo +"la potencia" +potencia +"y "+texto );
}
}
