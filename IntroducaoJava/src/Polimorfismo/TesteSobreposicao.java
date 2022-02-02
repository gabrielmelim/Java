package Polimorfismo;

public class TesteSobreposicao {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		Cachorro c = new Cachorro();
		Canguru can = new Canguru();

		
		m.emitirSom();
		c.emitirSom();
	    can.movimentar();
		
	}

}
