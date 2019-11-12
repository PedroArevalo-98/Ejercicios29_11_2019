package Ej_1_DVD;

public class MainDVD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVDCine dvd1 = new DVDCine("descripcion",true , true, 120);
		
		dvd1.setDuracion(114);
		dvd1.setGenThriller(true);
		dvd1.setResumen(true);
		System.out.println(dvd1.muestraDVDCine());
		System.out.println(dvd1.esThriller());
		System.out.println(dvd1.tieneResumen());
		System.out.println(dvd1.muestraDuracion());
	}

}
