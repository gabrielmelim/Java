package Lista1Introducao;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		float n1, n2, n3;
		float media;

		Scanner id = new Scanner(System.in);

		System.out.println("Informe a nota 1: ");
		n1 = id.nextFloat();
		System.out.println("Informe a nota 2: ");
		n2 = id.nextFloat();
		System.out.println("Informe a nota 3: ");
		n3 = id.nextFloat();

		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		
		System.out.println("A média ponderada é:  "+media);
	}

}
