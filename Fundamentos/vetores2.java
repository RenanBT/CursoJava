package Fundamentos;
import java.util.Scanner;

public class vetores2 {
	static final int QTDE_NOTAS = 10;
	
	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);

		
		double notas[] = new double[QTDE_NOTAS];
		double impares[]= new double [QTDE_NOTAS];
		double pares[]= new double [QTDE_NOTAS];
		int i;
		int contPar = 0;
		int contImp = 0;
		
		
		double media = 0;
		int cont = 0;
		
		for (i=0; i<QTDE_NOTAS; i++) {
			 System.out.println("Digite a nota do aluno: ");
			 notas[i] = scanner.nextDouble();
			 
				if(notas[i] % 2 == 1 ) {
					
					impares[contImp] = notas[i];
					contImp++;
				}
				
				else{
					
					pares[contPar] = notas[i];
					contPar++;
					
				}
				
				
		}
			 
		
		for (i=0; i<QTDE_NOTAS; i++) {
		System.out.println("Todos os números: " + notas[i]);
		}
		
		for (i=0; i<contPar; i++) {
			
			System.out.println("Números pares: " + pares[i]);
			
			}
		
		for (i=0; i<contImp; i++) {
			System.out.println("Números impares: " + impares[i]);
			}
		scanner.close();
			
	}
	
	
	
	}
	


