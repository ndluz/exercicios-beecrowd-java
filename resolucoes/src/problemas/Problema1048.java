package problemas;

import java.util.Scanner;

public class Problema1048 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        double sal = sc.nextDouble();
	        double reajuste = 0;
	        String porcent = "";

	        if (sal > 0 && sal <= 400.00) {
	            reajuste = sal * 0.15;
	            porcent = "15 %";
	        } else if (sal > 400.00 && sal <= 800.00) {
	            reajuste = sal * 0.12;
	            porcent = "12 %";
	        } else if (sal > 800.00 && sal <= 1200.00) {
	            reajuste = sal * 0.10;
	            porcent = "10 %";
	        } else if (sal > 1200.00 && sal <= 2000.00) {
	            reajuste = sal * 0.07;
	            porcent = "7 %";
	        } else if (sal > 2000.00) {
	            reajuste = sal * 0.04;
	            porcent = "4 %";
	        }

	        System.out.printf("Novo salario: %.2f%n", (sal + reajuste));
	        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
	        System.out.printf("Em percentual: %s%n", porcent);

	        sc.close();
	    }


}
