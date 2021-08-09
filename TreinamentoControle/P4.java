package TreinamentoControle;

import java.util.Scanner;

public class P4 {
	
	public static void main(String[] args) {
		
		//	4. Criar um programa que receba um numero e diga se ele e um numero primo.
		
		
		Scanner a = new Scanner(System.in);
		System.out.println("Digite o número: ");
		
		int b = a.nextInt();
		
		if(b > 3) {
			
	        if(b % 2 == 0 || b % 3 ==0 ) {
	        	
	        	System.out.println(b + " Não é primo");
	        }
			
	        else {
	        	System.out.println( b + "  é primo");
	        }
			
		}
		else {
			System.out.println(b + " é primo");
		}
		
		
		
		
		
		
	}

}
