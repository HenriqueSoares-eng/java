package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Pessoa {
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	@Override 
	public String toString() {
		return this.nome + " -> " + this.idade + " anos";
	}
}

public class OrdenaLista {
	public static void main (String[]args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("henrique", 19));
		pessoas.add(new Pessoa("lucas", 27));
		pessoas.add(new Pessoa("giulia", 18));
		pessoas.add(new Pessoa("aline", 48));
		pessoas.add(new Pessoa("isadora", 17));
		System.out.println(pessoas);
		Collections.sort(pessoas, Comparator.comparingInt((Pessoa p) -> p.idade).reversed());
		System.out.println(pessoas);
		
	}

}
