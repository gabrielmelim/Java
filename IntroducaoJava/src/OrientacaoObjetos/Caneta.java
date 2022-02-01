/*
 para definir um objeto deve conter: 
 caracteristicas = atributos.
 comportamento = métodos (ações , funções do seu objeto).
 estado = como o objeto está, situação em que se encontra.
 this -> faz referencias a atributos dentro da mesma classe.
 */

package OrientacaoObjetos;

public class Caneta {
	//ATRIBUTOS (variaveis do seu objeto onde irá fazer as definições).
	private String cor;
	private float ponta;
	private int carga;
	boolean tampada;
	
	//METODOS (executa uma ação do seu objeto).
	
	public Caneta(int valor) // -> metodo construtor. (dentro do parenteses serão criadas variaves)
	{
		//definindo como padrão a caneta com tampa fechada.
		this.tampada = true;
		
		//definindo o atributo carga = valor(variavel criada no construtor).
		this.carga=valor;
	}
	
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
	

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
}
