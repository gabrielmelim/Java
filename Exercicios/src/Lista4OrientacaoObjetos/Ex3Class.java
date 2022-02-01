package Lista4OrientacaoObjetos;

public class Ex3Class {

	String imei,cor,marca;
	
	public Ex3Class(String marca,String imei,String cor)
	{
		this.imei=imei;
		this.cor=cor;
		this.marca=marca;
	}
	
	public void status()
	{
		System.out.println("___________________________");
		System.out.println("Marca: "+marca);
		System.out.println("imei: "+imei);
		System.out.println("Cor: "+cor);
	}
}
