package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		double total = 0;
		int contador = 0;
		double media = 0;

		System.out.println("Digite a nota");

		Scanner s = new Scanner(System.in);
		double nota = s.nextDouble();


			while (nota != -1)

			{
				if (nota <=10 && nota>=0) 
				{
				
				total = total + nota;
				contador++;
				media = total / contador;
				
				}

				System.out.println("Digite a nota");

				s = new Scanner(System.in);
				nota = s.nextDouble();
			}
		

		System.out.println("Total de alunos : " + contador);
		System.out.println("Média da turma: " + media);

		s.close();

	
	}
	}

