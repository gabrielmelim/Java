package Lista5Heranca;

public class InformacoesAnimais {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setAcao("Correr");
		cachorro.setNome("Bolt");
		cachorro.setIdade(8);
		
		cavalo.setAcao("Correr");
		cavalo.setNome("Pocoto");
		cavalo.setIdade(12);
		
		preguica.setAcao("Subir em arvore");
		preguica.setNome("Lerdo");
		preguica.setIdade(23);
		
		
		
		System.out.println("Nome do cachorro:"+cachorro.getNome()+"		Idade do cachorro:"+cachorro.getIdade() +"		Ação do cachorro:"+cachorro.getAcao());
		System.out.println("Nome do cachorro:"+cavalo.getNome()+"		Idade do cachorro:"+cavalo.getIdade() +"		Ação do cachorro: "+cavalo.getAcao());
		System.out.println("Nome do cachorro:"+preguica.getNome()+"		Idade do cachorro:"+preguica.getIdade() +"		Ação do cachorro: "+preguica.getAcao());
	
		

	}

}
