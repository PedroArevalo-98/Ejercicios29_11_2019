package Ej_3_Cuenta;

import java.util.Scanner;

public class MainCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuenta c1 = new Cuenta ();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca su DNI");

		String DNI = sc.nextLine();
		c1.setDNI(DNI);
		//c1.setDNI(DNI);
		//System.out.println(DNI);
		
		System.out.println("Introduzca su saldo");
		float saldo_actual = sc.nextFloat();
		c1.setSaldo_actual(saldo_actual);
		sc.nextLine();
		
		System.out.println("Introduzca su interés anual");
		float interes_anual = sc.nextFloat();
		//System.out.println(c1.mostrar());
		c1.setInteres_anual(interes_anual);
		
		System.out.println("Introduzca la cantidad que quiere ingresar");
		double cantidad= sc.nextDouble();
		System.out.println("Su nueva cantidad es" +c1.ingresar(cantidad));
		
		
		System.out.println("Introduzca la cantidad que quiere retirar");
		double cant_retiro= sc.nextDouble();
		System.out.println("Su nueva cantidad es" +c1.retirar(cant_retiro));
		
		System.out.println("Su saldo actual es" +c1.getSaldo_actual());


	}
	

}
