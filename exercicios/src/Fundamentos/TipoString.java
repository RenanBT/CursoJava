package Fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(0));
		
		String s = "Boa tarde";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Renan";
		var sobrenome = "Betereli";
		var idade = 30;
		var salario = 2500.8767;
		
		System.out.printf("O senhor %s %s tem %d e ganha %.2f\n\n", nome, sobrenome, idade, salario  ); 
		
				
				System.out.println("Frase qualquer".contains("qual"));
				System.out.println("Frase qualquer".indexOf("qual"));
				System.out.println("Frase qualquer".substring(6));
				System.out.println("Frase qualquer".substring(6, 9)); // 9 caracter nesta funcao nao e incluido no resultado
				
		
		
	}
	

}
