package Lista5Heranca ;

public class Cachorro extends Animais {
	
	public void movimentar()
	{
		System.out.println("		Ação: Correndo");
	}
	
	@Override
	 public void nome()
	  {
		  System.out.print("Nome: Bolt");
	  }
	@Override
	  public void idade()
	  {
		  System.out.print("		Idade: 8");
	  }
	@Override
	  public void emitirSom()
	  {
		  System.out.print("		Som: De Cachorro");
	  }
	

	
}
