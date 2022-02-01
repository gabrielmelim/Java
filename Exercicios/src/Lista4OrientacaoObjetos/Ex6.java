package Lista4OrientacaoObjetos;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		String nome,email,senha;
		Scanner ler = new Scanner(System.in);
		System.out.print("Cadastre seu nome: ");
		nome=ler.next();
		System.out.print("Cadastre seu email: ");
		email=ler.next();
		System.out.print("Cadastre sua senha: ");
		senha=ler.next();
		Ex6Class banco = new Ex6Class(nome,email,senha);
		banco.logar();
		
		

	}

}
