//Laço de repetição Faça enquanto -> Do While
package Repeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		int n1, n2;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o Número que será dividido: ");
		n1 = leia.nextInt();
		System.out.println("Digite o numero divisor: ");
		n2 = leia.nextInt();

		do {
			System.out.println("A soma é " + (n1 + n2));

			System.out.println("\nDigite um Número ");
			n1 = leia.nextInt();
			System.out.println("\nDigite um Número: ");
			n2 = leia.nextInt();
		} while (n1 != -1 || n2 != -1);

	}

}
