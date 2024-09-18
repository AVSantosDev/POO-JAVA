package cofrinho;

import java.util.Scanner;

public class Menu {
	private Scanner scanner;
	public Cofrinho cofrinho;
	
	public Menu() {
	scanner = new Scanner(System.in);
	cofrinho = new Cofrinho();
	}
	

	public void opcaoSele() { // menu principal		
		System.out.println("COFRINHO");
		System.out.println("1- Adicionar Moeda");
		System.out.println("2- Remover Moeda");
		System.out.println("3- Listar Moedas");
		System.out.println("4- Calcular total convertido para Real");
		System.out.println("0- Sair");
			
		/*
		 * recebe do teclado em numero mas é uma string.
		 */
		String opcaoSele = scanner.next();//nessa parte ele pega a string que usuario digitou e armazena na memoria
			
		switch(opcaoSele) {
			
		case"0"://essa operação faz a validação se o usuario digitou uma opção valida ou opção de sair
			System.out.println("Programa encerrado!");
			break;//encerra o programa 
		default:
			System.out.println("Opção invalida!");
			opcaoSele();//retorna para menu principal.
			break;
			
		case "1":
			/*
			 * no caso 1 abre outro menu o input é (int) inteiro
			 */
			System.out.println("Selecione a moeda a ser adicionada");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			System.out.println("0 - Retornar");
			int opcaoMoeda = scanner.nextInt();
			double valor;
			switch (opcaoMoeda){
				case 1:
					System.out.println("Digite o valor em Real");
					valor = scanner.nextDouble();//tratamento para receber valor e double e armazenar
					System.out.println("Digite um valor");
					scanner.nextLine();
					MoedaReal real = new MoedaReal(valor);//converte o input para uma variael posterior e armazenada na lista
					cofrinho.adicionarMoeda(real);//input é armazenado na lista
					opcaoSele();//retorna ao menu principal
				default:
					System.out.println("Opção Invalida, Tente novamente:");//tratativa caso o usuario digite um valor diferente da lista
					break;
				
				case 2:
					System.out.println("Digite o valor em Dolar");
					valor = scanner.nextDouble();			
					scanner.nextLine();
					MoedaDolar dolar = new MoedaDolar(valor);
					cofrinho.adicionarMoeda(dolar);
					opcaoSele();
									break;
				case 3:
					System.out.println("Digite o valor em Euro");
					valor = scanner.nextDouble();
					scanner.nextLine();
					MoedaEuro euro = new MoedaEuro(valor);
					cofrinho.adicionarMoeda(euro);
					opcaoSele();
					break;
				case 0:
					opcaoSele();
					}
						
		case "2":
			exibirsubMenuRemover();//chama o menu de remover moedas
			opcaoSele();//exibe o menu de principal
			
		case "3":
			cofrinho.listarMoedas();//Chama o metodo listar as moedas que tem no cofrinho
			opcaoSele();//retorna ao menu principal
			break;
			
		case "4":
			double valorTotalConv = cofrinho.totalConvertido();//Metodo que converte o valor para Real.
			String valorTotalConvTexto = String.valueOf(valorTotalConv);
			valorTotalConvTexto = valorTotalConvTexto.replace(".",",");//substitui o ponto pela virgula
			System.out.println("Valor convertido para Real? " +valorTotalConvTexto);//retorna o valor do cofrinho em real ja conbvertido
			opcaoSele();//retorna ao menu principal
			break;
	
		}
	}
	
	
	public void exibirsubMenuRemover() {// metodo de remover moedas (menu)
		System.out.println("Escolha uma moeda");
		System.out.println("1 - Real");
		System.out.println("2 - Dolar");
		System.out.println("3 - Euro");
		
		int opcaoMoedas = scanner.nextInt();//recebe input da opcao acima
					
		System.out.println("Digite um valor");
		
		String valorMoedaTexto = scanner.next();//converte o valor recebido em String
		
		valorMoedaTexto = valorMoedaTexto.replace(",",".");
		double valorMoedas = Double.parseDouble(valorMoedaTexto);//converte a String para double
		
		Moedas moedas = null;
		
		if (opcaoMoedas == 1) {//remove o objeto conforme está na lista
			moedas = new MoedaReal(valorMoedas);
		}else if (opcaoMoedas == 2) {
			moedas = new MoedaDolar(valorMoedas);
		}else if (opcaoMoedas == 3) {
			moedas = new MoedaEuro(valorMoedas);
		}
		
		
		boolean removeMoedas =cofrinho.removerMoeda(moedas);//chama o metodo remover moeda da classe cofrinho
		if(removeMoedas) {
			System.out.println("**MOEDA REMOVIDA COM SUCESSO**");
		}else {
			System.out.println("não foi encontrada moeda no confrinho com esse valor");
		}
	
	}
	
}
