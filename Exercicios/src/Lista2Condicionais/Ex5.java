package Lista2Condicionais;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		int numero, soma=0;
		Scanner id = new Scanner(System.in);
		
		do 
		{
			System.out.print("Digite um numero: ");
			numero=id.nextInt();
			soma+=numero;
		}while(numero!=0);
		
		System.out.println("Soma="+soma);
		
	}

}
