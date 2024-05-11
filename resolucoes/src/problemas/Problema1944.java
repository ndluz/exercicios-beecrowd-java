package problemas;

import java.util.Scanner;
import java.util.Stack;

public class Problema1944 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letter = "";
		int count = 0;
		int amount = sc.nextInt();

		Stack<String> letters = new Stack<>();
		
		for (int i = 0; i <= amount; i++) {
			
			letter = sc.nextLine();
			
			if (letters.size() == 0) {
				letters.push("F A C E");
			}
			
			if (!letter.isEmpty()) {
				StringBuilder previousString = new StringBuilder(letters.peek());
				StringBuilder reversed = new StringBuilder(letter).reverse();
				
				if ( 0 == previousString.compareTo(reversed)) {
					count++;
					letters.pop();
					
				} else {
					letters.push(letter);
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}