package Lista3;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		int matriz[][] = new int [3][3],i,j,soma=0;
		Scanner ler = new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("Digite o Número da Matriz: ");
				matriz[i][j]=ler.nextInt();
			
			}
		}
		soma=matriz[0][0]+matriz[1][1]+matriz[2][2];
		System.out.println("A soma principal da matriz: "+soma);
	}

}
