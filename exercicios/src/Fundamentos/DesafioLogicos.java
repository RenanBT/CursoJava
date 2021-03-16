package Fundamentos;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		
		Boolean trabalho1 = false;
		Boolean trabalho2 = false;
		Boolean sorvete = trabalho1 || trabalho2;
		
		System.out.println("TV 50pol " + (trabalho1 && trabalho2));
		System.out.println("TV 32pol " + (trabalho1 ^ trabalho2));
	    System.out.println("Foram tomar sorvete? " + sorvete); 
	    
	    if (sorvete == true ) 
	    
	    	System.out.println("( : ");
	    else
	    	
	    	System.out.println("X.X");
	    	
	    	;
	}

}
