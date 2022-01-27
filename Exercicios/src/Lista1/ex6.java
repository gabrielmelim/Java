package Lista1;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, d, p1, p2;

        Scanner id = new Scanner (System.in);

        System.out.print("Digite o valor de x1: ");
        x1=id.nextDouble();

        System.out.print("Digite o valor de x2: ");
        x2=id.nextDouble();

        System.out.print("Digite o valor de y1: ");
        y1=id.nextDouble();

        System.out.print("Digite o valor de y2: ");
        y2=id.nextDouble();

        p1=Math.pow((x2-x1), 2);

        p2=Math.pow((y2-y1), 2);

        d=Math.sqrt((p1+p2));

        System.out.print("A distancia entre os pontos é: "+ d);
		
		
	}

}
