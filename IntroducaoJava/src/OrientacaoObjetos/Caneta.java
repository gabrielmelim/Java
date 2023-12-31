/*
 para definir um objeto deve conter: 
 caracteristicas = atributos.
 comportamento = m�todos (a��es , fun��es do seu objeto).
 estado = como o objeto est�, situa��o em que se encontra.
 this -> faz referencias a atributos dentro da mesma classe.
 */

package OrientacaoObjetos;

public class Caneta {
	//ATRIBUTOS (variaveis do seu objeto onde ir� fazer as defini��es).
	private String cor;
	private float ponta;
	private int carga;
	boolean tampada;
	
	//METODOS (executa uma a��o do seu objeto).
	
	public Caneta(int valor) // -> metodo construtor. (dentro do parenteses ser�o criadas variaves)
	{
		//definindo como padr�o a caneta com tampa fechada.
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
			System.out.println("ERRO! Caneta Est� Tampada");
		else
			System.out.println("Escrevendo...");
	}
	
	public void status()
	{
		System.out.println("A cor da caneta �: "+this.cor);
		System.out.println("A ponta �: "+this.ponta);
		System.out.println("Est� tampada? "+this.tampada);
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
