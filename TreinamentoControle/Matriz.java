package TreinamentoControle;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		//1. Criar um programa que receba um numero e verifique se ele esta entre 0 e 10 e e par
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Dig�te o n�mero: ");
		
		int a = scanner.nextInt();
		
		
		if ( a <= 0 && a >= 10) {
			if (a % 2 == 0 ){
				
		System.out.println(a + " � par");
							}
			
			else {
				
				System.out.println(a + "� impar");
			}
								}
			
		}
			
		
		
		
		
	}


