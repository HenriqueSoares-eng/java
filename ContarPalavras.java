package lista;

import java.util.ArrayList;

public class ContarPalavras {
	public static void main (String[]args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("calculo");
		lista.add("fisica");
		lista.add("quimica");
		lista.add("calculo");
		int qtd = contarPalavra(lista,"calculo");
		System.out.println(qtd);
		
	}
	public static int contarPalavra(ArrayList<String> lista, String alvo) {
		int contador = 0;
		for (String valor: lista) {
			if (valor.equals(alvo)) {
				contador++;
			}
		}
		return contador;
	}
}
