package cofrinho;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	private List<Moedas> listaMoedas;
	
	
	public Cofrinho() {
		listaMoedas = new ArrayList<>();//Lista de armazenamento de moedas
	}

	/*
	 * metodo para Adicionar moedas no cofrinho,
	 * armazena o valor na listaMoedas
	 */
	public void adicionarMoeda(Moedas moeda) {//Metodo para adicino cofrinho
		listaMoedas.add(moeda);
		System.out.println("**MOEDA ADICIONADA AO COFRINHO**");
	}
	
	/*
	 * Metodo para remover moedas.
	 */
	 public boolean removerMoeda(Moedas moeda) {
	     return (this.listaMoedas.remove(moeda));
	 }
	 
	 /*
	  * Metodo para listar todas as moedas contidas na listaMoedas
	  */
	public void listarMoedas() {
		if (listaMoedas.isEmpty()) {
	    System.out.println("O cofrinho está vazio.");
	    return;
		}
	    	for (Moedas moeda : this.listaMoedas) {
	    		moeda.info();
	    	}
	   }
	 
	/*
	 * Metodo para converter as moedas Dolar e Euro para real conforme o que está na memoria
	 * da lista
	 */
	public double totalConvertido() {
		
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		double valorTotal = 0;
		for (Moedas moedas : this.listaMoedas) {
			valorTotal += moedas.converter();
		}
		return valorTotal;
	}
}

