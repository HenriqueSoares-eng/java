package lista;

import java.util.ArrayList;

public class ElementosExclusivos {
	public static void main (String[]args) {
		ArrayList<String> lista_1 = new ArrayList<String>();
		ArrayList<String> lista_2 = new ArrayList<String>();
		lista_1.add("calculo");
		lista_1.add("fisica");
		lista_1.add("quimica");
		lista_1.add("calculo");
		lista_1.add("quimica");
		
		lista_2.add("calculo");
		lista_2.add("circuitos eletricos");
		lista_2.add("eletronica");
		lista_2.add("eletromagnetismo");
		
		ArrayList<String> exclusivos = elementosExclusivos(lista_1,lista_2);
		System.out.println(exclusivos);
		
	}
	public static ArrayList<String> elementosExclusivos(ArrayList<String> lista_1, ArrayList<String> lista_2) {
		ArrayList<String> exclusivos = new ArrayList<String>();
		for (String valor: lista_1) {
			boolean esta_na_lista = exclusivos.contains(valor) || lista_2.contains(valor);
			if (esta_na_lista) {
				continue;
			}
			else {
				exclusivos.add(valor);
			}
		}
		for (String valor: lista_2) {
			boolean esta_na_lista = exclusivos.contains(valor) || lista_1.contains(valor);
			if (esta_na_lista) {
				continue;
			}
			else {
				exclusivos.add(valor);
			}
		}
		return exclusivos;
	}

}
