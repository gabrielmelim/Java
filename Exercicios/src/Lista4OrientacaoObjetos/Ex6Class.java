package Lista4OrientacaoObjetos;

import java.util.Random;
import java.util.Scanner;

public class Ex6Class {

	private String nome, cpf, email, senha;
	private int id, verificarid;
	private String verificar_senha,verificar_email,verificando;
	private int login,cont,sair;
	private float saldo_total=100,novo_saldo,saldo,sacar_saldo,conta;
	public void cadastrar() {
		Scanner ler = new Scanner(System.in);
		Random gerador = new Random();
		System.out.print("Cadastre um nome: ");
		nome = ler.next();
		System.out.print("Cadastre um email: ");
		email = ler.next();
		System.out.print("Cadastre uma senha: ");
		senha = ler.next();
		System.out.println("___________________________________________________________");
		System.out.println("verificando dados da conta...");
		System.out.println("nome: " + nome);
		System.out.println("email: " + email);
		System.out.println("senha: " + senha);
		id = gerador.nextInt(10) + 1;
		System.out.println("gerando id da sua conta....");
		System.out.println("ID: " + id);
		System.out.println("___________________________________________________________");

	}

	public void logar() {
		Scanner ler = new Scanner(System.in);
		System.out.println("fazendo login na conta bancaria aguarde um instante....\n");
		System.out.println("por favor selecione a opção 1 para fazer login, opção 0 para sair\n");
		System.out.print("informe o numero: ");
		login = ler.nextInt();
		System.out.println("___________________________________________________________");

		while (cont != 0) 
		{
			
			if(login==1)
			{
				/*System.out.println("Para sair da conta digite 0 para continuar digite 1");
				sair=ler.nextInt();
				if(sair==0)
					cont=sair;*/
				
				System.out.print("Digite seu Email: ");
				verificar_email=ler.next();
				System.out.print("Digite sua Senha: ");
				verificar_senha=ler.next();
				if(verificar_email.equals(email) && verificar_senha.equals(senha))
				{
					System.out.println("\nLOGADO COM SUCESSO!\n");
					System.out.print("Por Favor digite 1 para depositar, 2 para sacar, 3 ver saldo:");
					verificando=ler.next();
					
					if(verificando.equals("1"))
					{
						System.out.println("Digite o ID da sua conta para continuar: ");
						verificarid=ler.nextInt();
						
					}
				}
				else
					System.out.println("Email ou Senha inválidos");
			}

		}
		System.out.println("deslogado com sucesso!");
	}

	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
			
	
}
