package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class desafioForeach {
	
	public static void main(String[] args) {
		
		
		
		double mediaAluno = 0;
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas que ser�o registradas: ");
		
		int quantNotas= a.nextInt();
		
		double [] notas = new double [quantNotas];
		
		Scanner notasDigitadas = new Scanner(System.in);
		
		for(int i = 0; i < quantNotas; i++) {
			
			System.out.println("Digite a nota n�mero " + (i+1));
			
			double notasD = notasDigitadas.nextDouble();
			
			if(notasD >= 0 && notasD <= 10) {
			
			notas [i] = notasD;
			
			}
			
			else {
				
				System.out.println("Nota inv�lida");
				
				i--;
			}
			
		}
		
		
		
		System.out.println(Arrays.toString(notas));
		
		for( double nota: notas) {
			
			mediaAluno += nota;
			
			
		}
		
		
		System.out.println("M�dia do aluno: " + (mediaAluno / quantNotas) );
		
		a.close();
		notasDigitadas.close();
	}

}
