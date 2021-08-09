package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		
          Scanner entrada = new Scanner(System.in);
          
    		String s = "";
         
          
          while ( !s.equalsIgnoreCase("fim") )
          {
        	  
        	  System.out.println("Digite a mensagem: ");
        	  s = entrada.nextLine();
        	  
        	  System.out.println(s);
        	 
        	
        
        	      	  
        	  
          }
          
          
		
          entrada.close();
        
		
		
	}

}
