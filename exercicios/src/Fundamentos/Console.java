package Fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		
		System.out.print("Bom ");
		
		System.out.print("dia! \n\n" );
		 
		System.out.println("Bom");
		
		System.out.println("dia!");
	   
	    System.out.printf("Megasena: %d %d %d %d %d %d \n" , 1, 2, 3, 4, 5, 6);
		
	    System.out.printf("Salário: %.2f%n", 1234.5678);
	    
	    System.out.printf("Nome: %s%n", "Joao"); 
	    
	    Scanner entrada = new Scanner (System.in);
	    
	    System.out.print("Digite o nome: ");
	    String nome = entrada.nextLine();
	    
	    System.out.print("Digite o Sobrenome: ");
	     String sobrenome = entrada.nextLine();
	     
	     System.out.print("Idade: ");
	     int idade = entrada.nextInt();
	     
	     System.out.printf( "%s %s tem %d anos", nome, sobrenome, idade); 
	     
	     entrada.close(); 
	    
	}
	
	

}
