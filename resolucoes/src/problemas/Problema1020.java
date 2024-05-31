package problemas;

import java.util.Scanner;

public class Problema1020 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int dias;
	        int anos;
	        int mes;
	        int dia;
	        int resultado;

	        dias = sc.nextInt();
	        anos = (dias / 365);
	        resultado = dias - (anos * 365);

	        mes = resultado / 30;
	        resultado = resultado - (mes * 30);

	        dia = resultado;

	        System.out.println(anos + " ano(s)");
	        System.out.println(mes + " mes(es)");
	        System.out.println(dia + " dia(s)");
	        
	        sc.close();
	    }
	 
}
