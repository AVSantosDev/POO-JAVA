package cofrinho;

public class MoedaDolar extends Moedas{
	  private static final double TAXACAMBIO = 4.72;

	public MoedaDolar(double valor) {
		this.valor  = valor;
		
	}
	@Override
	public void info() {//Metodo info da classe Moeda dolar
		// TODO Auto-generated method stub
		System.out.println("DOLAR - " +valor);//Teste de retorno
		
	}

	@Override
	public double converter() {
		// TODO Auto-generated method stub
		return this.valor * TAXACAMBIO;//conversor de valor 
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
		
		MoedaDolar objetoDolar = (MoedaDolar) objeto;
		
		if (this.valor != objetoDolar.valor) {
			return false;
		}
		
		return true;
	}

}
