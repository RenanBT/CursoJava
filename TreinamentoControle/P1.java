package TreinamentoControle;

import java.util.Scanner;

public class P1 {
	
	public static void main(String[] args) {
		//1. Criar um programa que receba um numero e verifique se ele esta entre 0 e 10 e e par
		
				Scanner numero = new Scanner (System.in);
				
				System.out.print("Digíte o número: ");
				
				int a = numero.nextInt();
				
			
				
				
				if ( a >= 0 && a <= 10) {
					if (a % 2 == 0 ){
						
				System.out.print(a + " É par");
									}
					
					else {
						
						System.out.print(a + " É impar");
					}
										}
					
				}
	}
	
