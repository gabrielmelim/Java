package Interface;

public class Radio2 implements Radio{

	private boolean ligado;
	private int volume=0;
	
	@Override
	public void ligar() {
		System.out.println("Ligando Radio ");
		ligado=true;
	}

	@Override
	public void desligar() {
		System.out.println("Desligando Radio");
		ligado=false;
	}

	@Override
	public void maisVolume() {
		volume++;
		System.out.println(volume);
		
	}

	@Override
	public void menosVolume() {
		volume--;
		System.out.println(volume);
		
	}

	@Override
	public void trocarEstacao() {
		System.out.println("Trocando Estação...");
		
	}

}
