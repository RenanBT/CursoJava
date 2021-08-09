package TreinamentoControle;

import java.util.Scanner;

public class P3 {
	
	public static void main(String[] args) {
		// 3. Criar um programa que receba duas notas parciais, calcular a média final. 
		//Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
		//se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário imprime no console "Reprovado".
		
		
		Scanner nota = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		
		double nota1 = nota.nextDouble();
		
		System.out.println("Digite a segunda nota nota");
		
		double nota2 = nota.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		if (media <= 10 && media >= 0) {
		
		if (media >= 7.0) {
			
			System.out.println("Média "+ media +" Aprovado");
		}
		else if (media >= 4.0) {
				System.out.println("Média "+ media +" Recuperação");
			}
		else {
			System.out.println("Média "+ media +" Reprovado");
			
		}
		
		
	}
	}
}
	

