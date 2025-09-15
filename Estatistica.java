package lista;

import java.util.ArrayList;

public class Estatistica {
	public static void main(String[]args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(8);
		numeros.add(6);
		numeros.add(10);
		numeros.add(7);
		numeros.add(9);
		System.out.println(media(numeros));
	}
	public static double media(ArrayList<Integer> numeros) {
		int soma = 0;
		for (int valor: numeros) {
			soma = soma + valor;
		}
		return soma/numeros.size();
	}
}
