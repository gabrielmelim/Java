package OrientacaoObjetos;
import java.util.Scanner;
public class AulaIntro {

	public static void main(String[] args) {
		int x;
		//leitura de variavel.
		Scanner ler = new Scanner(System.in); 
		
		//escrevendo na tela.
		System.out.print("Informe a carga: ");
		
		//ler o valor informado do print na varivavel X
		x=ler.nextInt(); 
		
		//puxando informaçoes da classe caneta para meu objeto caneta1.
		//x se tonra parametro da minha classe ou seja ele simboliza o valor do tipo inteiro da classe caneta.
		//passando o valor da variavel X informado no print.
		Caneta caneta1 =  new Caneta(x); 
		
		System.out.println("A carga está em: "+caneta1.getCarga());
		caneta1.setCarga(30);
		System.out.println("A carga foi alterada para: "+caneta1.getCarga());
		
		

	}

}
