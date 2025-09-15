package lista;

import java.util.ArrayList;

public class lista {
	public static void main(String[]args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("calculo");
		lista.add("fisica");
		lista.add("fisico-quimica");
		// imprimindo o tamanho da lista
		System.out.println("tamanho da lista: "+ lista.size());
		boolean esta_na_lista = lista.contains("calculo");
		if (esta_na_lista == true) {
			System.out.println("ta na lista");
		}
		else {
			System.out.println("nao esta na lista");
		}
	}
}
