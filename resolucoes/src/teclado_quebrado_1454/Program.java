package teclado_quebrado_1454;

import java.util.LinkedList;
import java.util.Scanner;

public class Program {

	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(true) {
				try {
					String entry;
					String[] aux;
					String homeText = "";
					boolean isHome = false;
					LinkedList<String> res =  new LinkedList<>();
					entry = sc.nextLine();
					aux = entry.split("");
				
					for (int i = 0; i < aux.length; i++) {
						if (aux[i].compareTo("[") == 0){
							isHome = true;
							continue;
						}
						
						if (aux[i].compareTo("]") == 0) {
							isHome = false;
							res.addFirst(homeText);
							continue;
						}
						
						if (isHome) {
							homeText += aux[i];
							continue;
						}
						res.add(aux[i]);
						
					}
					res.forEach( item -> System.out.print(item));
				
				sc.close();
				} catch (Exception e) {
					break;
				}
			}
		}
}
