package Lista4OrientacaoObjetos;

//Classe do meu cliente 
public class ex1Class {
	//Atributos
	String nome;
	int idade;
	String rg;
	String cpf;
		
	public void InformarCpf()
	{
		if(this.cpf.length()==14)
			System.out.println("cpf: "+this.cpf);
		else
			System.out.println("por favor digite o cpf corretamente");
	}
	
	public void InformarIdade()
	{
		System.out.println("Idade: "+this.idade);
	}
	
	public void InformarNome()
	{
		System.out.println("Idade: "+this.nome);
	}
	
	public void InformarRg()
	{
		if(this.rg.length()==7)
			System.out.println("cpf: "+this.rg);
		else
			System.out.println("por favor digite o cpf corretamente");
	}
}
