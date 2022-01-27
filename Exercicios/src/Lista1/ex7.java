package Lista1;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {

		Scanner id = new Scanner(System.in);
		float a, b, c, d, e, f, x, y;

		System.out.print("Digite A: ");
		a=id.nextFloat();
		System.out.print("Digite B: ");
		b=id.nextFloat();
		System.out.print("Digite C: ");
		c=id.nextFloat();
		System.out.print("Digite D: ");
		d=id.nextFloat();
		System.out.print("Digite E: ");
		e=id.nextFloat();
		System.out.print("Digite F: ");
		f=id.nextFloat();
		
		x = ( (c*e) - (b*f) ) / ( (a*e) - (b*d) );
		y = ( (a*f) - (c*d) ) / ( (a*e) - (b*d) );
		
		System.out.println("X="+x+"Y="+y);
		
		
	}

}
