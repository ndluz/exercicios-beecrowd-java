package problemas;
import java.util.Scanner;
public class Problema2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] lines = input.split(" ");
        
        int qtd = Integer.parseInt(lines[0]);
        String medicoes = sc.nextLine();
        String[] arrayMedicoes = medicoes.split(" ");
		        
	        int[] array = new int[qtd];
	        for (int i = 0; i < qtd; i++) {
	            array[i] = Integer.parseInt(arrayMedicoes[i]);
	        }
	
	        int resposta = 0;
	        for (int i = 1; i < qtd; i++) {
	            if (resposta > 0) break;
	            if (array[i - 1] > array[i]) resposta = i + 1;
	        }
	
	        System.out.println(resposta);
	        
	        sc.close();
	    }
}
