package Lista6Collection;
import java.util.ArrayList;
import java.util.Scanner;


public class LojaClass  {
	
	ArrayList<Produto> Estoque = new ArrayList<Produto>();
	Scanner ler = new Scanner(System.in);
	
	public void Cadastrar()
	{
		int id;
		double preco;
		String nome_produto;		
		
		System.out.print("Informe a quantidade de produtos para cadastro: ");
		int qntProds = ler.nextInt();
		
		for (int i = 0; i < qntProds; i++) 
		{
			System.out.print("Informe um id: ");
			id=ler.nextInt();
			
			System.out.print("Informe o nome do produto: ");
			nome_produto=ler.next();
			
			System.out.print("Informe o preço: ");
			preco=ler.nextDouble();
			
			Produto produto = new Produto(id,preco,nome_produto);
			
			this.Estoque.add(produto);
		}
		
	}
	
	public void ImprimirProdutos() 
	{
		for(int i=0; i < Estoque.size(); i++) 
		{
			System.out.println("Id:"+ Estoque.get(i).getId() + "		Nome:" + Estoque.get(i).getNome_produto() + "		Preco:" + Estoque.get(i).getPreco());
		}
	}
	
	
	public void Deletar(int id) {
		for (int i = 0; i < Estoque.size(); i++) 
		{
			if (id == Estoque.get(i).getId()) 
			{
				Estoque.remove(i);
			}
		}
	}
	
	
	public void Alterar(int id) {
		for (int i = 0; i < Estoque.size(); i++) 
		{
			if (id == Estoque.get(i).getId()) 
			{
				System.out.print("Informe o nome do produto: ");
				Estoque.get(i).setNome_produto(ler.next());
				
				System.out.print("Informe o preço: ");
				Estoque.get(i).setPreco(ler.nextDouble());
			}
		}
	}
	
	public void line() 
	{
		System.out.println("_______________________________________________________________________________________________________--");
	}

}
