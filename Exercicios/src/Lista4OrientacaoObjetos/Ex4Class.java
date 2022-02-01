package Lista4OrientacaoObjetos;

public class Ex4Class {
	String nome;
	int codigo_funcionario;
	float salario1=3000;
	float salario2=1200;
	
	public Ex4Class (String nome,int codigo_funcionario)
	{
		this.nome=nome;
		this.codigo_funcionario=codigo_funcionario;
		
	}
	
	public void status() 
	{
		System.out.println("_____________________________________-");
		System.out.println("Nome: "+nome);
		System.out.println("Qual tipo de funcionário você é?");
		if(codigo_funcionario==1) 
			System.out.println("Voce é um gerente");
		else if(codigo_funcionario ==2)
			System.out.println("Voce é um funcionário normal");
		else
			System.out.println("Erro por favor tente o código 1 para funcionario e 2 para gerente");
		
		System.out.println("Qual o seu salário? ");
		if(codigo_funcionario ==1)
			System.out.println("Salario="+salario1+"R$");
		else if (codigo_funcionario==2)
			System.out.println("Salario="+salario2+"R$");
		else
		System.out.println("Erro por favor verfique o código de funcionario");
		
		
	}
}
