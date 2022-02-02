package Lista5Heranca;

public class Cavalo extends Cachorro
{
	@Override
	public void movimentar()
	{
		System.out.println("			Ação: Correndo");
	}
	
	@Override
	 public void nome()
	  {
		  System.out.print("Nome: Pocoto");
	  }
	@Override
	  public void idade()
	  {
		  System.out.print("		Idade: 12");
	  }
	@Override
	  public void emitirSom()
	  {
		  System.out.print("		Som: De Cavalo");
	  }
}
