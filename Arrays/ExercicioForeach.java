package Arrays;

import java.util.Arrays;

public class ExercicioForeach {
	
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
		for ( double notaAlunoA: notasAlunoA ) {
			
			mediaAlunoA += notaAlunoA;
			
		}
		
		double mediaAlunoB = 0;
		
	final double notaArmazenada = 7.0;
		double [] notasAlunoB = {10 , notaArmazenada, 8};
		
		for (double notaAlunoB: notasAlunoB) {
			
			mediaAlunoB += notaAlunoB;
			
		}
		
		System.out.println(mediaAlunoA / notasAlunoA.length);
		
		System.out.println(Arrays.toString(notasAlunoB));
		
		System.out.println(mediaAlunoB / notasAlunoB.length);
	}

}
