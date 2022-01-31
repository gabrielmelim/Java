package OrientacaoObjetos;

public class AulaIntro {

	public static void main(String[] args) {
		Caneta caneta1 =  new Caneta();
		
		int x;
		caneta1.cor="Azul";
		caneta1.ponta=0.5f;
		caneta1.tampar();
		caneta1.carga=80;
		caneta1.status();
		caneta1.escrever();
		
		System.out.println("_____________________________");
		Caneta caneta2 = new Caneta();
		caneta2.cor="Vermelha";
		caneta2.ponta=0.7f;
		caneta2.destampar();
		caneta2.carga=30;
		caneta2.status();
		caneta2.escrever();

	}

}
