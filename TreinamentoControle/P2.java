package TreinamentoControle;

import java.util.Scanner;

public class P2 {
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Digite o ano");
		
		 int ano = a.nextInt();
		 
		 if (ano % 400 == 0) {
			 
			 System.out.println(ano + " � bisexto");
		 }
			 
			 else if (ano % 4 == 0 && ano % 100 != 0) {	 
				 System.out.println(ano + " � bisexto");
			 }
		 
		
		 else {
			 
			 System.out.println(ano + " n�o � bisexto");
			 
		 }
	}

}
