package LacoRepeticao;

import java.util.Scanner;
public class Exerc�cio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int x, n, contpar=0, contimpar=0;
		
		for (x=1;x<=10;x++)
		{
			System.out.println("Escreva um n�mero inteiro: ");
			n = ler.nextInt();			
			
			if (n%2==0)
			{
				contpar++;
			}
			else
			{
				contimpar++;
			}
		}
		System.out.println("Foram digitados "+contpar+" n�meros pares e "+contimpar+" n�meros �mpares");
	}

}
