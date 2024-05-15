package problemas;

import java.util.Locale;
import java.util.Scanner;

public class Problema1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int number, quantityHours;
		Double pricePerHour;
		
		number = sc.nextInt();
		sc.nextLine();
		quantityHours = sc.nextInt();
		sc.nextLine();
		pricePerHour = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("NUMBER = " + number);
		System.out.println(String.format("SALARY = U$ %.2f", quantityHours * pricePerHour) );
		
		sc.close();
	}

}
