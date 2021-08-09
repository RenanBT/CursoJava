package Classe;

public class Jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Taís", 70.250);

		Comida c1 = new Comida("Arroz", 0.750);
		
		Comida c2 = new Comida("Feijoada", 1.0);

	System.out.println(p1.apresentar());
	
	p1.comer(c1);
	System.out.println(p1.apresentar());
	
	p1.comer(c2);
	
	System.out.println(p1.apresentar());
	}

}
