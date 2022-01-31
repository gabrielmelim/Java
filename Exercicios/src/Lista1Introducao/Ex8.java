package Lista1Introducao;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		double precoFabrica, precoFinal;

		Scanner id = new Scanner(System.in);

		System.out.print("Valor do carro livre de impostos ");
		precoFabrica = id.nextDouble();

		precoFinal = (precoFabrica * 0.73) + precoFabrica;

		System.out.print("O valor do carro com impostos é:" + precoFinal);
	}

}
