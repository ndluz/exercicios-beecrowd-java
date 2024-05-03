package brind_face_2015;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		
		if (amount <= 1) {
			System.exit(1);
		}
		
		int giftsCount = 0;
		String studentLetters;
		
		boolean isEqual = false;
		
		List<String> letters = new ArrayList<String>();
		letters.add("F A C E");
		
		for (int i = 0; i <= amount; i++) {
			
			studentLetters = sc.nextLine();
			letters.add(studentLetters);
			//System.out.println(letters);
			
			StringBuilder normal = new StringBuilder(letters.get(letters.size() - 2));
			StringBuilder reversed = new StringBuilder(letters.get(letters.size()- 1));
			isEqual = 0 == normal.compareTo(reversed.reverse());
			
			//System.out.println(isEqual);
			//System.out.println(normal + " normal");
			//System.out.println(reversed + " reversed");
			
			if (isEqual) {
				giftsCount++;
				
				letters.remove(letters.size()-1);
				letters.remove(letters.size()-1);
				
				if (letters.size() == 0) {
					letters.add("F A C E");
					continue;
					
				}
			}
			//System.out.println(letters);
		}
		
		System.out.println(giftsCount);
		sc.close();
	}
}