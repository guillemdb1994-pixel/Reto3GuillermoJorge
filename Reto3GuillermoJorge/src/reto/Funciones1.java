package reto;

import java.util.Scanner;

public class Funciones1 {

	public static String capitalizarString(String nombre) {
		nombre = nombre.toLowerCase();
		nombre = Character.toUpperCase(nombre.charAt(0)) + nombre.substring(1);
		return nombre;
	}

	public static String generarApodo(String nombre) {
		String apodo = "";
		if (nombre.length() > 4) {
			apodo = nombre.replaceAll(nombre.substring(3), "") + nombre.charAt(nombre.length() - 1) + nombre.length();

		} else {
			apodo = nombre + nombre.length();
		}
		return apodo;
	}

	public static void pideNombres(Scanner sc) {

		String nombrePeq = "";
		String nombreAlf = "";
		boolean firstIter = true;
		while (true) {
			System.out.println("Introduce nombre");
			String nombre = sc.nextLine();
			if (nombre.equals("")) {
				break;
			}
			nombre = capitalizarString(nombre);
			if (firstIter) {
				nombrePeq = nombre;
				nombreAlf = nombre;
				firstIter = false;
			}
			if (nombrePeq.length() > nombre.length()) {
				nombrePeq = nombre;
			}
			if (nombrePeq.compareToIgnoreCase(nombre) > 0) {
				nombreAlf = nombre;
			}
			System.out.println("Apodo: " + generarApodo(nombre));
		}

		System.out.println("Nombre mas corto: " + nombrePeq);
		System.out.println("Nombre alfabeticamente primero: " + nombreAlf);
	}
}
