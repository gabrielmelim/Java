package Lista4OrientacaoObjetos;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		String marca;
		String cor;
		float peso;
		int quantidade;
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe a marca:");
		marca=ler.next();
		System.out.print("Informe a cor:");
		cor=ler.next();
		System.out.print("Informe o peso:");
		peso=ler.nextInt();
		System.out.print("Informe a quantidade:");
		quantidade=ler.nextInt();
		
		Ex2Class aviao = new Ex2Class(marca,cor,peso,quantidade);
		aviao.mostrarinformacao();
		
		
	}

}
