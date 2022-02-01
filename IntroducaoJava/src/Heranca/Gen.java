package Heranca;

public class Gen {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Participante p2 = new Participante();
		Professor p3 = new Professor();
		
		p1.setNome("Luck");
		p1.setIdade(19);
		
		p2.setNome("gabriel");
		p2.setIdade(25);
		p2.aniversario();
		
		System.out.println(p1.getNome()+"\t"+p1.getIdade());
		System.out.println(p2.getNome()+"\t"+p2.getIdade());
		
		
	}

}
