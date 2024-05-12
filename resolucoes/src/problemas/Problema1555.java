package problemas;
import java.util.Scanner;

public class Problema1555 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        
	        for (int i = 0; i < n; i++) {
	            int x = sc.nextInt();
	            int y = sc.nextInt();
	            int rafael = (int) Math.pow(3*x, 2) + (int) Math.pow(y, 2);
	            int beto = 2 * (int) Math.pow(x, 2) + (int) Math.pow(5*y, 2);
	            int carlos = -100 * x + (int) Math.pow(y, 3);
	            
	            if (beto > carlos && beto > rafael) {
	                System.out.println("Beto ganhou");
	            } else if (carlos > beto && carlos > rafael) {
	                System.out.println("Carlos ganhou");
	            } else {
	                System.out.println("Rafael ganhou");
	            }
	        }
	        sc.close();
	    }
	    
	}
	

