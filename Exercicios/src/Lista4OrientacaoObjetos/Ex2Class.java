package Lista4OrientacaoObjetos;

public class Ex2Class {

		String marca,cor;
		float peso;
		int quantidade;
		
		public Ex2Class (String marca,String cor,float peso,int quantidade)
		{
			this.marca=marca;
			this.cor=cor;
			this.peso=peso;
			this.quantidade=quantidade;
		}
		
		public void status() 
		{
			System.out.println("_______________________________");
			System.out.println("Marca: "+marca);
			System.out.println("Cor: "+cor);
			System.out.println("Peso: "+peso+"kg");
			System.out.println("Quantidade de pessoas: "+quantidade);
		}
		
		
}
