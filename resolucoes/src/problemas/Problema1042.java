package problemas;

import java.util.Arrays;
import java.util.Scanner;

public class Problema1042 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();

	        int[] valores = {a, b, c};
	        int[] valoresfinal = Arrays.copyOf(valores, valores.length);
	        
	        Arrays.sort(valoresfinal);

	        for (int i = 0; i < 3; i++) {
	            System.out.println(valoresfinal[i]);
	        }

	        System.out.println();

	        for (int i = 0; i < 3; i++) {
	            System.out.println(valores[i]);
	        }

	        sc.close();
	    }

}
