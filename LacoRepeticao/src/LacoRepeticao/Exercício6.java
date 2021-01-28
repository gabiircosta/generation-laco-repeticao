package LacoRepeticao;

import java.util.Scanner;
public class Exercício6 
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		float x, somamult3=0, qtdemult3=0, media;
		
		do
		{
			System.out.println("Escreva um número: ");
			x = ler.nextFloat();
			
				if (x!=0 && x%3==0)
				{
					somamult3 = somamult3+x;
					qtdemult3++;
				}
		
	
			}while (x!=0);
				
		media = somamult3/qtdemult3;
		System.out.println("A média da soma dos números digitados que são múltiplos de 3 é: "+media);
	}
}