package Lista1Introducao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {

		int seg, min, hora, tempo;
		Scanner id = new Scanner(System.in);

		System.out.println("Digite a duração do evento em segundos: ");
		tempo = id.nextInt();

		hora = tempo / 3600;
		min = (tempo % 3600) / 60;
		seg = (tempo % 3600) % 60;

		System.out.println("A duração do evento foi de " + hora + " horas " + min + " minutos " + seg + " segundos");

	}

}
