package Classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
	Produto p1 = new Produto();
	p1.nome = "Notebook";
	p1.preco = 3999.99;
	p1.desconto = 0.05;
	
	var p2 = new Produto();
	
	p2.nome = "Mouse";
	p2.preco = 99.99;
	p2.desconto = 0.1;
	
	System.out.println(p1.nome + "\nR$ " + p1.preco + 
			"\ndesconto a vista %" + (p1.desconto * 100));
	
	
	System.out.println("\n\n"+ p2.nome + "\nR$ " + p2.preco + 
			"\ndesconto a vista %" + (p2.desconto * 100));
	
	}

}
