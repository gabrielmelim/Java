package Lista4;

public class ex1 {

	public static void main(String[] args) {
		ex1Class cliente = new ex1Class();
		
		//definindo valores a váriavel do meu cliente
		cliente.cpf ="122.122.122-22";
		cliente.nome ="José";
		cliente.rg="1234567";
		cliente.idade=18;
		
		//mostrando os valores do meu cliente 
		cliente.InformarCpf();
		cliente.InformarNome();
		cliente.InformarRg();
		cliente.InformarIdade();

	}

}
