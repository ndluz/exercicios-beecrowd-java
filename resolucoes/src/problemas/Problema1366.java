package problemas;

import java.util.Scanner;

public class Problema1366 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int quantidade = 0;
            int metade = 0;
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            while (n != 0) {
                int c = sc.nextInt();
                int v = sc.nextInt();

                if (v / 4 == 0 && v > 1) {
                    metade += 1;
                } else if (v / 4 > 0) {
                    quantidade += v / 4;
                    if (v % 4 > 1) {
                        metade += 1;
                    }
                }
                if (metade == 2) {
                    quantidade += 1;
                    metade -= 2;
                }
                
                n -= 1;
            }

            System.out.println(quantidade);
        }

        sc.close();
    }

}

