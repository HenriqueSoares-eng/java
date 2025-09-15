package lista;

import java.util.ArrayList;

public class ElementosUnicos {
	public static void main (String[]args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("calculo");
		lista.add("fisica");
		lista.add("quimica");
		lista.add("calculo");
		lista.add("quimica");
		int qtd_elementos_unicos = contarElementosUnicos(lista);
		System.out.println("Quantidade de elementos unicos: " + qtd_elementos_unicos);
	}
	public static int contarElementosUnicos(ArrayList<String> lista) {
		ArrayList<String> unicos = new ArrayList<String>();
		for (String valor: lista) {
			boolean esta_na_lista = unicos.contains(valor);
			if (esta_na_lista) {
				continue;
			}
			else {
				unicos.add(valor);
			}
		}
		return unicos.size();
	}
}
