package Classe;
public class Data {
	
	int dia;
	int mes;
	int ano;

Data(){
	
	dia =  01;
	mes =  01;
	ano =  1970;
	
}

Data(int diaInicial, int mesInicial, int anoInicial){
	 dia = diaInicial = 01;
	mes = mesInicial = 01;
	ano = anoInicial = 1970;
	
}
	



	

	String dataFormatada() {

		return String.format("%d/%d/%d", dia, mes, ano);
	

}
}