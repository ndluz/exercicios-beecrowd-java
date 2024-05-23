package problemas;

import java.util.Scanner;

public class Problema1715 {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int local;
	        int count = 0;

	        int[][] jogos = new int[n][m];

	        for (int i = 0; i < n; i++) {
	            local = 0;
	            for (int j = 0; j < m; j++) {
	                jogos[i][j] = sc.nextInt();
	                if (jogos[i][j] > 0) {
	                    local++;
	                } else {
	                    local = 0;
	                }
	            }
	            if (local >= m) {
	                count++;
	                local = 0;
	            }
	        }

	        System.out.println(count);
	        sc.close();
	}

}
