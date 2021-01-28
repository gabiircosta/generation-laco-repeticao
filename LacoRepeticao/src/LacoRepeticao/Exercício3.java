package LacoRepeticao;

import java.util.Scanner;
public class Exercício3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner ler = new Scanner (System.in);
	int x=0,cont21=0,cont50=0;
	
	while (x!=-99)
	{
		System.out.println("Escreva a sua idade: ");
		x = ler.nextInt();
		
		if (x<21 && x!=-99)
		{
			cont21++;
		}
		if (x>50)
		{
			cont50++;
		}
	}
	System.out.println("A quantidade de pessoas com idade menor de 21 anos é de: "+cont21+" e a quantidade de pessoas com idade superior a 50 anos é de: "+cont50);

	}

}
