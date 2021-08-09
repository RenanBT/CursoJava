package TreinamentoControle;

import java.util.Random;
import java.util.Scanner;

public class P6 {
	public static void main(String[] args) {
//6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma variável. O Jogador tem 10 tentativas para 
//adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade de tentativas restantes, e imprima se 
//o número inserido é maior ou menor do que o número armazenado.
		

		int max = 101;
		
		int count = 10;
		
		Random rand = new Random();
		
		int random = rand.nextInt(max);
		
		
		while (count > 0 ) {
			
			count --;
			
			System.out.println("Digite um número");
			
			Scanner a = new Scanner(System.in);
			int chute = a.nextInt();
			
			if (chute == random ) {
				System.out.println( "Acerto Mizeravi! número = " + random);
				count = 0;
			}
			
			if( chute > random) {
				
				System.out.println("O número é menor");
				
			}
			
			else if ( chute < random) {
				System.out.println("O número é maior");
				
			}
			
			else if (count == 0) {
				
				System.out.println("ERRRROOOOUUU....");
				System.out.println("O número é: " + random);
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
