package Classe;

public class DataTeste {
	public static void main(String[] args) {
		
	
	
	Data d1 = new Data();
	d1.dia = 11;
	d1.mes = 4;
	d1.ano = 1990;
	
	
	Data d2 = new Data();
	
	d2.dia = 7;
	d2.mes = 1;
	d2.ano = 2020;
	
	Data d3 = new Data(); 
	
	
	System.out.println("Data de Nascimento do Renan é:"+d1.dataFormatada());
	
	System.out.println("\n\nData de aniversário da Taís é: " 
	+ d2.dataFormatada());
	
	System.out.println(d3.dataFormatada());
	
	}

}
