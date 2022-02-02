package Lista5Heranca;

public abstract class Animais {
	  private String nome;
	  private int idade;
	  private String emitirSom;
	
	  
	  
	  public void line()
	  {
		  System.out.println("_____________________________________________________________________________________________________________");
	  }
	  
	  public void nome()
	  {
		  System.out.print("Nome Padrao");
	  }
	  
	  public void idade()
	  {
		  System.out.print("		Idade Padrao");
	  }

	  public void emitirSom()
	  {
		  System.out.print("		Som Padrao");
	  }
	  
	  
}
