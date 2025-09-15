package lista;

import java.util.ArrayList;

public class MenorNumero {
	public static void main (String[]args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(6);
		numeros.add(3);
		numeros.add(9);
		numeros.add(1);
		numeros.add(8);
		int indice_menor_elemento = menorNumero(numeros);
		System.out.println(indice_menor_elemento);
	}
	public static int menorNumero(ArrayList<Integer>numeros) {
		if (numeros.size()==0) {
			return -1;
		}
		int menor_elemento = numeros.get(0);
		int indice_menor_elemento = 0;
		int indice = 0;
		for (int valor: numeros) {
			if (valor < menor_elemento) {
				menor_elemento = valor;
				indice_menor_elemento = indice;
			}
			indice++;
		}
		return indice_menor_elemento;
	}

}
