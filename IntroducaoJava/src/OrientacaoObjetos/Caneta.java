/*
 para definir um objeto deve conter: 
 caracteristicas = atributos.
 comportamento = métodos (ações , funções do seu objeto).
 estado = como o objeto está, situação em que se encontra.
 this -> faz referencias a atributos dentro da mesma classe.
 */

package OrientacaoObjetos;

public class Caneta {
	//ATRIBUTOS (variaveis do seu objeto onde irá fazer as definições.)
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	//METODOS (executa uma ação do seu objeto.)
	public void tampar()
	{
		this.tampada=true;
	}
	
	public void destampar()
	{
		this.tampada=false;
	}
	
	public void escrever()
	{
		if(this.tampada==tampada)
			System.out.println("ERRO! Caneta Está Tampada");
		else
			System.out.println("Escrevendo...");
	}
	
	public void status()
	{
		System.out.println("A cor da caneta é: "+this.cor);
		System.out.println("A ponta é: "+this.ponta);
		System.out.println("Está tampada? "+this.tampada);
		System.out.println("Carga: "+this.carga+"%");
	}
}
