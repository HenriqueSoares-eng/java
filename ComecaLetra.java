package lista;

import java.util.ArrayList;

public class ComecaLetra {
	public static void main (String[]args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("calculo");
		lista.add("circuitos eletricos");
		lista.add("circuitos eletronicos");
		lista.add("fisica");
		lista.add("quimica");
		lista.add("algebra linear");
		System.out.println(comecaLetra(lista, 'c'));
	}
	public static ArrayList<String> comecaLetra(ArrayList<String> lista, char letra) {
		ArrayList<String> filtro= new ArrayList<String>();
		for (String valor: lista) {
			if (valor.startsWith(String.valueOf(letra))) {
				filtro.add(valor);
			}
		}
		return filtro;
	}

}
