package controle;

public class SwitchBreak {
	public static void main(String[] args) {

		String conceito = "";

		int nota = 12;

		switch (nota) {

		case 10:
		case 9:

			conceito = "A";

			break;
			
		case 8:
		case 7:

			conceito = "B";

			break;
		case 6:
		case 5:

			conceito = "C";

			break;
		case 4:
		case 3:

			conceito = "D";

			break;
		case 2:
		case 1: case 0:
			
			conceito = "E";

			break;
			
		default:
			conceito = "Conceito não encontrado";


		}
		
		System.out.println("Conceito é: "+ conceito);
	}
}
