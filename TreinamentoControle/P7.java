package TreinamentoControle;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
//7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números inseridos, 
//   caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
		
		
		double soma = 0;
		
		Scanner a = new Scanner (System.in);
		System.out.println("Digite um número: ");
		
		double b = a.nextDouble();
		
		while (b >= 0) {
			
			soma = soma + b;
			System.out.println(soma);
			
			System.out.println("Digite um número: ");
			
			 b = a.nextDouble();
			
		}
		
	
		
		System.out.println(soma);
		
	}

}
