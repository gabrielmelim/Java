package Lista6Collection;
import java.util.Scanner;
public class Loja {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		LojaClass loja = new LojaClass();
		
		int id;
		
		loja.Cadastrar();
		loja.ImprimirProdutos();
		
		System.out.print("Informe o id do produto a ser deletado: ");
		id = ler.nextInt();
		
		loja.Deletar(id);
		
		loja.ImprimirProdutos();
		
		System.out.print("Informe o id do produto a ser alterado: ");
		id = ler.nextInt();
		
		loja.Alterar(id);
		loja.ImprimirProdutos();

	}

}
