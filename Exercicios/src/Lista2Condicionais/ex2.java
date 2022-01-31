package Lista2Condicionais;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner id = new Scanner(System.in);
		
		int par = 0, num, impar = 0, i;

		for (i = 1; i <= 10; i++) 
		{
			System.out.print("Informe o numero:");
			num=id.nextInt();
			
			if(num%2 == 0 )
			{
				par++;
			}
			else 
			impar++;
			
		}
		System.out.print("Pares:"+par);
		System.out.println("\nImpares:"+impar);

	}

}
