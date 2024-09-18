package cofrinho;

public class MoedaReal extends Moedas{

	public MoedaReal(double valorReal) {
		this.valor  = valorReal;
		
	}
	
	@Override
	public void info() {//Metodo info da classe Moeda dolar
		
		System.out.println("REAL - " + valor);
	
	}

	@Override
	public double converter() {
		return valor;
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
		
		MoedaReal objetoReal = (MoedaReal) objeto;
		
		if (this.valor != objetoReal.valor) {
			return false;
		}
		
		return true;
	}
	

}
