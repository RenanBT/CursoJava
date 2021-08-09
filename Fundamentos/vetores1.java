package Fundamentos;
import java.util.Scanner;

public class vetores1 {
	static final int QTDE_NOTAS = 10;
	
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);

		
		double notas[] = new double[QTDE_NOTAS];
		int i;
		
		
		double media = 0;
		int cont = 0;
		
		for (i=0; i<QTDE_NOTAS; i++) {
			 System.out.println("Digite a nota do aluno: ");
			 notas[i] = scanner.nextDouble();
			 
				if(notas[i] % 2 == 1 ) {
					
					media = media + notas[i];
					cont++;
				}
				
		}
			 
		
		
		
		double mediaFinal = media / cont;
		System.out.println(mediaFinal);
		scanner.close();
			
	}
	
	
	
	}
	


