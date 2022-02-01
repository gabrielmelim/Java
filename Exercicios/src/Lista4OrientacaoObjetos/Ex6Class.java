package Lista4OrientacaoObjetos;
import java.util.Random;
import java.util.Scanner;
public class Ex6Class {
	
	String nome,email,senha,verificar_senha;
	int id,verificarid;
	int login,x=0;
	float saldo=4000;
	
	
	public void logar()
	{
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		System.out.print("Cadastre um nome: ");
		nome=ler.next();
		System.out.print("Cadastre um email: ");
		email=ler.next();
		System.out.print("Cadastre uma senha: ");
		senha=ler.next();
		System.out.println("___________________________________________________________");
		System.out.println("verificando dados da conta...");
		System.out.println("nome: "+nome);
		System.out.println("email: "+email);
		System.out.println("senha: "+senha);
		id=gerador.nextInt(1000)+1;
		System.out.println("gerando id da sua conta....");
		System.out.println("ID: "+id);
		System.out.println("___________________________________________________________");
		System.out.println("fazendo login na conta bancaria aguarde um instante....");
		System.out.println("por favor selecione a opção 1 para fazer login, opção 0 para sair.");
		System.out.print("informe o numero: ");
		login=ler.nextInt();
		System.out.println("___________________________________________________________");
		
		 
		do
		{
			switch(login)
			{
				case 1:
					System.out.print("informe seu ID para continuar ou aperte 0 para sair: ");
					verificarid=ler.nextInt();
					//System.out.print("informe sua senha para continuar ou aperte 0 para sair: ");
					//verificar_senha=ler.next();
					//System.out.println(verificar_senha);
					//System.out.println(senha);
					if(verificarid==id)
					{
						System.out.println("\nLOGADO COM SUCESSO!");
						System.out.println("Saldo: "+saldo);
						System.out.println("saindo...");
					}
					else
						System.out.println("Id Invalido!!");
				break;
				default:
					System.out.println("Erro verifique seus dados!");
			}
		
		}while(verificarid !=0); 
		System.out.println("deslogado com sucesso!");
	}
	
}
