package Lista5Heranca;

public class InformacoesAnimais {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		
		cachorro.nome();
		cachorro.idade();
		cachorro.emitirSom();
		cachorro.movimentar();
		cachorro.line();
		
		cavalo.nome();
		cavalo.idade();
		cavalo.emitirSom();
		cavalo.movimentar();
		cavalo.line();
		
		preguica.nome();
		preguica.idade();
		preguica.emitirSom();
		preguica.movimentar();
		preguica.line();
		
		

	}

}
