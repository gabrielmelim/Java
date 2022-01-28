//laço de repetição enquanto -> while 
package Repeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int n1, n2;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Número que será dividido: ");
		n1 = leia.nextInt();
		System.out.println("Digite o numero divisor: ");
		n2 = leia.nextInt();

		while (n2 != 0) {
			System.out.println("A divisão é: " + n1 / n2);

			System.out.println("Digite o Número que será dividido: ");
			n1 = leia.nextInt();
			System.out.println("Digite o numero divisor: ");
			n2 = leia.nextInt();
		}
		System.out.println("Não é possivel dividor por zero");
	}

}
