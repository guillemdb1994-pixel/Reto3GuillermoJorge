package reto;


public class Funciones2 {

	public static int contarPalabras(String frase) {
		int palabras = 0;
		String p = "";

		for (int i = 0; i < frase.length(); i++) {
			p += p.charAt(i);
			if (frase.charAt(i) == ' ') {
				p = "";
				palabras++;
			}
		}
		return palabras;
	}

	public static String invertirFrase(String Frase) {
		String p = "";
		String n = "";
		for (int i = 0; i < Frase.length(); i++) {
			p = "";
			if (Frase.charAt(i) == ' ') {
				n = p + n;
				p = "";
			} else {
				p = p + Frase.charAt(i);
			}
		}
		return n;
	}

	public static String palabraLarga(String Frase) {
		String palabralarga = "";
		String n = "";
		int ultimoindex = 0;
		for (int i = 0; i < Frase.length(); i++) {
			n = "";
			if (Frase.charAt(i) == ' ') {

				n = Frase.substring(ultimoindex).replaceAll(Frase.substring(i), "");
				ultimoindex = i;
			}
			if (n.length() > palabralarga.length()) {
				palabralarga = n;
			}
		}
		return palabralarga;
	}
}
