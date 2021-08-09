package Classe;

public class Produto {
	
	String nome;
	double preco;
	final static double desconto = 0.25;
	static double descontoAdicional = 0.25;
	double descontoTotal = desconto + descontoAdicional;
	
	Produto (){}
	
	Produto (String nomeInicial, double precoInicial){
		
		nome = nomeInicial;
		
		preco = precoInicial * (1 - descontoTotal);
		
		
		
		
	}
	

}
