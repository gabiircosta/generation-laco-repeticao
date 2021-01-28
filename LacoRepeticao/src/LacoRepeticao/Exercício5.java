package LacoRepeticao;

import java.util.Scanner;
public class Exercício5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int x, soma=0;
		
		do
		{
			System.out.println("Escreva um número: ");
			x = ler.nextInt();
			soma=soma+x;
		}
		while (x!=0);
		
		System.out.println("A soma dos números digitados é: "+soma);
		
	}

}
