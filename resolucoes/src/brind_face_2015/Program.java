package brind_face_2015;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int giftsCount = 0;
		String studentLetters;
		
		boolean isEqual = false;
		
		List<String> letters = new ArrayList<String>();
		letters.add("FACE");
		
		for (int i = 0; i < amount; i++) {
			studentLetters = sc.next();
			letters.add(studentLetters);
		}
		
		int i = 1;
		while(letters.size() > 1) {
			StringBuilder normal = new StringBuilder(letters.get(i - 1));
			StringBuilder reversed = new StringBuilder(letters.get(i));
			
			isEqual = 0 == normal.compareTo(reversed.reverse());
			System.out.println(isEqual);
			System.out.println(normal);
			System.out.println(reversed);
			
			if (isEqual) {
				giftsCount++;
				try {
					letters.remove(i);
					letters.remove(i-1);
					i = 1;
					
					
				} catch (Exception e) {
					letters.add("FACE");
					i = 1;
				}
			}
			
			if (i == amount) {
				break;
			}
			i++;
		}
		
		System.out.println(giftsCount);
		sc.close();
	}
}