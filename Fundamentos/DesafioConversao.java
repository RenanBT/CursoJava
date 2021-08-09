package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		 System.out.print("Digite o primeiro salário: ");
		    String s1 = entrada.nextLine().replace(",", ".");
		    
		    System.out.print("Digite o segundo salário: ");
		     String s2 = entrada.nextLine().replace(",", ".");;
		     
		     System.out.print("Digite o terceiro salário: ");
		     String s3 = entrada.nextLine().replace(",", ".");;
		     
		     double num1 = Double.parseDouble(s1);
			 double num2 = Double.parseDouble(s2);
			 double num3 = Double.parseDouble(s3);
	
			 double media = num1 + num2 + num3 ;	
	System.out.println("Média = " + media / 3); 
			 
			 //Integer num1 = 10000;
	//			System.out.println(num1.toString().length());	     
   //  System.out.printf( "%s %s tem %d anos", nome, sobrenome, idade); 
		     
		     
		     
		     
		     
		     entrada.close(); 
	}

}
