package cofrinho;

public class MoedaEuro extends Moedas{
	private static final double TAXACAMBIO = 5.22;
	
	public MoedaEuro(double valor) {
		this.valor  = valor;
		
	}
	@Override
	public void info() {//Metodo info da classe Moeda Euro
		// TODO Auto-generated method stub
		System.out.println("EURO - " +valor);//Teste de retorno
	}

	@Override
	public double converter() {
		// TODO Auto-generated method stub
		return this.valor * TAXACAMBIO;//conversor de valor de euro para Real
	}

	/*
	 * //nessa parte do codigo ele valida o endereço na memoria na lista
	 *  "objeto memoria == objeto memoria = retorna true ou false
	 * 
	 * primeiro valida a se o objeto é da mesma classe e depois o valor
	 * sempre vai pegar o primeiro valor igual o input.
	 */
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		MoedaEuro objetoEuro = (MoedaEuro) objeto;
		
		if (this.valor != objetoEuro.valor) {
			return false;
		}
		
		return true;
	}
	
}
