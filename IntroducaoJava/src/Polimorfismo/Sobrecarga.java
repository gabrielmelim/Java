package Polimorfismo;
//sobrecarga -> mesmo método, na mesma classe com assinaturas diferentes.

public class Sobrecarga {
	public void soma(int n1, int n2) //metodo soma criado com 2 parametros n1,n2 / assinatura do metodo.
	{
		System.out.println(n1+n2);
	}
	
	public void soma (int x, int y, int z) //metodo soma criado com 3 parametros x,y,z / assinatura do metodo.
	{
		System.out.println(x+y+z);
	}
	
	public void soma (double x, int y) //metodo soma criado com 2 parametros x,y/ assinatura do metodo.
	{
		System.out.println(x+y);
	}
}
