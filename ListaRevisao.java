package lista;

import java.util.ArrayList;

public class ListaRevisao {
	public static void main (String[]args) {
		ArrayList<String> livros = new ArrayList<String>();
		livros.add("calculo");
		livros.add("algebra linear");
		livros.add("geometria analitica");
		livros.add("medieval");
		int tamanho = livros.size();
		System.out.println("tamanho da lista: " + tamanho);
		boolean esta_nos_livros = livros.contains("medieval");
		if (esta_nos_livros) {
			System.out.println("esta na biblioteca");
		}
		else {
			System.out.println("nao esta na biblioteca");
		}
	}

}
