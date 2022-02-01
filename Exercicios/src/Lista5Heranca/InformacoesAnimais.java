package Lista5Heranca;

public class InformacoesAnimais {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setAcao("Correr");
		cachorro.setNome("Bolt");
		cachorro.setIdade(8);
		cachorro.setEmitir_som("AuAuAu");
		
		cavalo.setAcao("Correr");
		cavalo.setNome("Pocoto");
		cavalo.setIdade(12);
		cavalo.setEmitir_som("hiin in in hinir");
		
		preguica.setAcao("Subir em arvore");
		preguica.setNome("Lerdo");
		preguica.setIdade(23);
		preguica.setEmitir_som(".........");
		
		
		
		System.out.println("Nome do cachorro: "+cachorro.getNome()+"		Idade: "+cachorro.getIdade() +"		Ação: "+cachorro.getAcao() +"			Som: "+cachorro.getEmitir_som());
		System.out.println("Nome do cavalo: "+cavalo.getNome()+"		Idade: "+cavalo.getIdade() +"		Ação: "+cavalo.getAcao()+"			Som: "+cavalo.getEmitir_som());
		System.out.println("Nome do preguiça: "+preguica.getNome()+"		Idade: "+preguica.getIdade() +"		Ação: "+preguica.getAcao()+"		Som: "+preguica.getEmitir_som());
	
		

	}

}
