package Lista5Heranca;

public class Preguica extends Cachorro 
{

	@Override
	public void movimentar()
	{
		System.out.println("		A��o: Correndo");
	}
	
	@Override
	 public void nome()
	  {
		  System.out.print("Nome: Pregui�a");
	  }
	@Override
	  public void idade()
	  {
		  System.out.print("		Idade: 80");
	  }
	@Override
	  public void emitirSom()
	  {
		  System.out.print("		Som: De Pregui�a");
	  }
	
}
