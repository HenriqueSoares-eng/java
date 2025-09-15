package lista;

import java.util.ArrayList;

public class RemovePares {
	public static void main (String[]args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(2);
		lista.add(1);
		lista.add(6);
		lista.add(7);
		lista.add(4);
		lista.add(3);
		lista.add(5);
		System.out.println(removerPares(lista));
	}
	public static ArrayList<Integer> removerPares(ArrayList<Integer> lista) {
		ArrayList<Integer> impares = new ArrayList<Integer>();
		for (int valor: lista) {
			if (valor % 2 == 1) {
				impares.add(valor);
			}
		}
		return impares;
	}
}
