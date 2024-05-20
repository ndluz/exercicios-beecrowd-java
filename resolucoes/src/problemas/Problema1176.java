package problemas;

import java.util.Scanner;

public class Problema1176 {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int[] fib = new int[60];
	        fib[0] = 0;
	        fib[1] = 1;
	        
	        for (int i = 2; i < 60; i++) {
	            fib[i] = fib[i - 1] + fib[i - 2];
	        }

	        for (int j = 0; j < n; j++) {
	            int x = sc.nextInt();
	            System.out.println("Fib(" + x + ") = " + fib[x]);
	        }

	        sc.close();
	    }
	}

