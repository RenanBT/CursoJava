package Arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de alunos: ");
		
		int qntAlunos = entrada.nextInt();
		
	System.out.println("Digite a quantidade de notas por aluno: ");
		
		int qntNotas = entrada.nextInt();
		
		double total = 0;
		double [] [] notasDaTurma = new double [qntAlunos] [qntNotas];
		
		for(int a = 0; a < notasDaTurma.length; a++ ) {
			
			for(int n = 0; n < notasDaTurma[a].length; n++ ) {
				
				
				System.out.printf("Informe a nota %d do aluno %d " ,
						(n + 1),( a +1));
				
				notasDaTurma[a][n] = entrada.nextDouble();
				
				total += notasDaTurma[a][n];
				
				
			}
		}
		
		double media = total / (qntAlunos * qntNotas);
		
		System.out.println("A m�dia da turma �: " + media);
		
		entrada.close();
		
	}
	

}
