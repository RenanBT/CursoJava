package Classe;

public class AreaCircTest {
	
	public static void main(String[] args) {
		
		AreaCirc a = new AreaCirc(5.6);
		
		AreaCirc b = new AreaCirc(0);
		
		b.raio = 10;
		
		System.out.println(a.area());
		
		System.out.println(b.area());
	}

}
