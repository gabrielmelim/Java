package Lista2Condicionais;

import java.util.Scanner;

public class Ex4 {
	public static final int limite = 150;

	public static void main(String[] args) {
		Scanner id = new Scanner(System.in);
		int cont_calmas = 0, cont_mulheres_nervosas = 0, cont_homens_agressivos = 0, cont_outros_calmos = 0,
				cont_coroas_nervosas = 0, total_pessoas = 0, cont_jovens_calmos=0;
		int sexo, caracteristica, idade;

		while (total_pessoas < limite) {
			total_pessoas++;
			System.out.println("\nObtendo dados das pessoas");
			System.out.print("Informe a idade:");
			idade = id.nextInt();
			System.out.print("Informe o sexo (1)masculino ou (2)Feminino (3)outros: ");
			sexo = id.nextInt();
			System.out.print("Informe a caracteristica (1)Calma (2)Nervosa (3)Agressiva: ");
			caracteristica = id.nextInt();

			if (caracteristica == 1)
				cont_calmas++;
			if (sexo == 2 && caracteristica == 2)
				cont_mulheres_nervosas++;
			if (sexo == 1 && caracteristica == 3)
				cont_homens_agressivos++;
			if (sexo == 3 && caracteristica == 1)
				cont_outros_calmos++;
			if (caracteristica == 2 && idade > 40)
				cont_coroas_nervosas++;
			if(idade <=18 && caracteristica == 1)
				cont_jovens_calmos++;
				

		}
		System.out.println("\n");
		System.out.println("Total de pessoas calmas: " + cont_calmas);
		System.out.println("Total de mulheres nervosas: " + cont_mulheres_nervosas);
		System.out.println("Total de homens agressivo: " + cont_homens_agressivos);
		System.out.println("Total de outros calmos : " + cont_outros_calmos);
		System.out.println("Total de pessoas nervosas com mais de 40 anos: " + cont_coroas_nervosas);
		System.out.println("Total de pessoas calmas menor que 18 anos: " + cont_jovens_calmos);


	}

}
