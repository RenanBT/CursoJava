package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o dia da semana: ");
		String dia = entrada.nextLine();

		if (dia.contentEquals("domingo")) {
			System.out.println("1");
		}
		else if (dia.equalsIgnoreCase("segunda")||(dia.equalsIgnoreCase("segunda feira"))) {
				System.out.println("2");
			}
		else if (dia.equalsIgnoreCase("terca")||(dia.equalsIgnoreCase("terca feira"))) {
				System.out.println("3");
			}
		else if (dia.equalsIgnoreCase("quarta")||(dia.equalsIgnoreCase("quarta feira"))) {
				System.out.println("4");
			}
		else if (dia.equalsIgnoreCase("quinta")||(dia.equalsIgnoreCase("quinta feira"))) {
				System.out.println("5");
			}
		else if (dia.equalsIgnoreCase("sexta")||(dia.equalsIgnoreCase("sexta feira"))) {
				System.out.println("6");
			}
		else if (dia.equalsIgnoreCase("sabado")) {
				System.out.println("7");
			}

			
	

		entrada.close();

	}

}
