package Collection;

import java.util.ArrayList;

public class Exemplo1 {

	public static void main(String[] args) {
		String aula1="bloco I";
		String aula2="bloco II";
		String aula3="bloco III";
		
		ArrayList<String> aula = new ArrayList<>();
		System.out.println(aula);
		
		aula.add("Feira de Empregabilidade");
		System.out.println(aula);
		
		aula.add(aula1);
		System.out.println(aula);
		
		aula.add(aula2);
		aula.add(aula3);
		
		System.out.println(aula);
		
		aula.set(0, "Matricula");
		System.out.println(aula);
		
		System.out.println(aula.get(2));
		System.out.println(aula.size());
		
		System.out.println(aula.contains("Matricula"));
		System.out.println(aula.contains(aula3));
		
		
		aula.remove(0);
		System.out.println(aula);
		
		aula.clear();
		System.out.println(aula);
		
	}

}
