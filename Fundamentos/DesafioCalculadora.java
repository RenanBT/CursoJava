package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		 System.out.print("Digite o primeiro número: ");
		 double n1 = entrada.nextDouble();
		 
		 System.out.print("Digite o operador: ");
		 String sinal = entrada.next();
		    
	     System.out.print("Digite o segundo número: ");
	     double n2 = entrada.nextDouble();
		
		 
		
		 double resultado = "+".equals(sinal) ? n1 + n2 : 0;  
		 resultado = "-".equals(sinal) ? n1 - n2 : resultado;  
		 resultado = "*".equals(sinal) ? n1 * n2 : resultado;  
		 resultado = "/".equals(sinal) ? n1 / n2 : resultado;
		 resultado = "%".equals(sinal) ? n1 % n2 : resultado;  
	
		
		
	     System.out.printf("%.2f %s %.2f", n1, sinal, n2);
	     System.out.printf(" = ");
	     System.out.println(resultado);

		 
		 //double resultado = s1 == true ? resultado = num1 + num2 ; 
		 
		 //String s = simbolo == "+" ? num1 + num2 : num1 - num2; 
		 
		 
		 //double num1 = Double.parseDouble(simbolo); 
		 
		 
		// String resultado = media >= 7.0 ? "Aprovado" : media >= 3.5 ? "Em recuperacao" : "Reprovado"; 
			
		 
		 //double resultado = num1 + num2;
		    
		 //System.out.println(resultado);   
		    
		    entrada.close(); 
	}

}
