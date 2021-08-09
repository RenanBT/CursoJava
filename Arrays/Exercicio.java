package Arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		double [] notasAlunoA= new double[5];
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 6.5;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 7.75;
		notasAlunoA[3] = 10;
		notasAlunoA[4] = 10;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		System.out.println(notasAlunoA[3]);
	
		double mediaAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length ; i++ ) {
			
			mediaAlunoA += notasAlunoA[i];
			
		}
		
		double mediaAlunoB = 0;
		
	final double notaArmazenada = 7.0;
		double [] notasAlunoB = {10 , notaArmazenada, 8};
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			
			mediaAlunoB += notasAlunoB[i];
			
		}
		
		System.out.println(mediaAlunoA / notasAlunoA.length);
		
		System.out.println(Arrays.toString(notasAlunoB));
		
		System.out.println(mediaAlunoB / notasAlunoB.length);
		
		
		
		
	}

}
