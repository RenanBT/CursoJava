package Classe;



public class Pessoa {
	
	// string nome  +  double peso  // método comer
	
	String nome;
	
	double peso;
	
	
	Pessoa (String nome, double peso){
		
		this.nome = nome;
		
		this.peso = peso;
		}
	
	void comer (Comida comida) {
		if (comida !=null) {
			
			this.peso+= comida.peso;
			
		}
		
		
	}
	
	String apresentar() {
		return "Eu sou " + nome + " e peso " + peso + " Kg";
	}
	

}
