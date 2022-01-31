package Lista1Introducao;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		int idade, meses, dias, diasMes = 30;
		int diasAno = 365, diasVida, anos;

		Scanner id = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = id.nextInt();

		System.out.println("Fazem quantos meses que voce fez aniversario: ");
		meses = id.nextInt();

		System.out.println("Quantos dias se passaram do mes ate hoje: ");
		dias = id.nextInt();

		diasVida = (idade * diasAno) + (meses + diasMes);

		System.out.println("A sua idade em dias é " + diasVida);
	}

}
