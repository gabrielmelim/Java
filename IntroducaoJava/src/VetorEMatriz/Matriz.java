package VetorEMatriz;
import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] mat= {{1,2,3,},{4,5,6}};
		int[][]mat2 = new int[2][3];
				
			
		for (int linha=0;linha<4;linha++) 
		{
			for(int coluna=0;coluna<3;coluna++) 
			{
				System.out.println("Digite um numero:");
				mat2[linha][coluna]=ler.nextInt();
				System.out.println(mat2[linha][coluna]);
			}
		}
		
		
		for(int x=0;x<2;x++)
		{
			for(int y=0;y<3;y++)
			{
				System.out.println(mat[x][y]+"\t");
			}
			System.out.println("\n");
		}
		
	}

}
