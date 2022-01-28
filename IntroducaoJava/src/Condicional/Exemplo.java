/*
IF -> SE
ELSE -> SENAO
ELSE IF = SENAO SE
|| -> ou
&& -> e 
*/

package Condicional;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		int x;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um Número: ");
		x = ler.nextInt();

		if (x == 5 || x == 7) 
		{
			System.out.println("O valor é 5 ou 7");
		} else if (x < 5 && x > 3) 
		{
			System.out.println("O valor é menor 5 e maior que 3");
		} else 
		{
			System.out.println("O valor é maior que 5");
		}
		System.out.println("\nFIM DO PROGRAMA");

	}

}
