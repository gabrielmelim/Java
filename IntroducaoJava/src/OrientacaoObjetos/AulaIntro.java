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
		
		caneta1.cor="Azul";
		caneta1.ponta=0.5f;
		caneta1.tampar();
		//caneta1.carga=80; //definindo valor direto da minha classe.
		caneta1.status();
		caneta1.escrever();
		
		System.out.print("Informe a carga: ");
		x=ler.nextInt();
		System.out.println("_____________________________");
		Caneta caneta2 = new Caneta(x);
		caneta2.cor="Vermelha";
		caneta2.ponta=0.7f;
		caneta2.destampar();
		//caneta2.carga=30; // definindo valor direto da minha classe.
		caneta2.status();
		caneta2.escrever();

	}

}
