package LacoRepeticao;

import java.util.Scanner;
public class Exerc�cio6 
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		float x, somamult3=0, qtdemult3=0, media;
		
		do
		{
			System.out.println("Escreva um n�mero: ");
			x = ler.nextFloat();
			
				if (x!=0 && x%3==0)
				{
					somamult3 = somamult3+x;
					qtdemult3++;
				}
		
	
			}while (x!=0);
				
		media = somamult3/qtdemult3;
		System.out.println("A m�dia da soma dos n�meros digitados que s�o m�ltiplos de 3 �: "+media);
	}
}