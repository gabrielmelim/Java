package VetorEMatriz;
import java.util.Scanner;//declarando biblioteca que � utilizada para usar o comando Scanner entre outros.
public class Vetor {

	public static void main(String[] args) {
		int[]vet = new int [5]; //declarando um novo vetor com 5 posi��es. 
		Scanner ler = new Scanner(System.in);//criando variavel de leitura.
		int soma=0;
		
		for(int x=0;x<5;x++)//iniciando um la�o de repeti��o para ir de 0 at� 4.
		{
			System.out.print("Digite um n�mero: ");//pedindo para digitar um n�mero na tela.
			vet[x]=ler.nextInt();//lendo o numero digitado e armazenando na variavel X.
			System.out.println(vet[x]);//mostrando o numero digitado na tela armazenado na variavel X.
			soma=soma+vet[x];// soma recebe valor de soma + vetor no indice X.
		}
		
		System.out.println("A soma dos valores �:"+soma);
		
		for(int x=0;x<5;x++)//iniciando la�o de repeti��o para ir de 0 at� 4. 
		{
			System.out.println(vet[x]);//printando cada repeti��o na tela.
		}

	}

}
