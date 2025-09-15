package lista;

import java.util.ArrayList;

public class Reverso {
	public static void main(String[]args) { 
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("calculo");
		lista.add("fisica");
		lista.add("quimica");
		System.out.println(reverso(lista));
	}
	public static ArrayList<String> reverso(ArrayList<String> lista) {
		ArrayList<String> reverso = new ArrayList<String>();
		for (String valor: lista) {
			String invertida = new StringBuilder(valor).reverse().toString();
			reverso.add(invertida);
		}
		return reverso;
	}

}
