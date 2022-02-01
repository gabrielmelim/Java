package Lista4OrientacaoObjetos;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		String marca,cor,imei;
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe a marca: ");
		marca=ler.nextLine();
		System.out.print("Informe o imei: ");
		imei=ler.next();
		System.out.print("Informe a cor ");
		cor=ler.next();
		Ex3Class eletronico  = new Ex3Class(marca,imei,cor);
		eletronico.status();
	}

}
