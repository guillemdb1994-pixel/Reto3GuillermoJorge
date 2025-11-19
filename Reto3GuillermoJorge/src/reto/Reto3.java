package reto;

import java.util.Scanner;

public class Reto3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int key=99;
		while (key!=0) {
			System.out.println("1. Analizar Palabra");
			System.out.println("2. Analizar Frase");
			System.out.println("0. Salir");
			key=Integer.parseInt(sc.nextLine());
			switch (key) {
			case 1:
				Funciones1.pideNombres(sc);
				break;
			case 2:
				Funciones2.menuFrase(sc);
				break;
			case 0:
				key=0;
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
		}
	}

}
