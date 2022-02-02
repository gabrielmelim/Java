package Polimorfismo;

public abstract class Animal {
	
	private double peso;
	private String nome;
	
	public void emitirSom()
	{
		System.out.println("Som generico");
	}
	
	public void movimentar()
	{
		System.out.println("Movimento generico");
	}
	
}
