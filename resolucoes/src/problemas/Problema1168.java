package problemas;

import java.util.Scanner;

public class Problema1168 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (n != 0) {
            String numeros = sc.nextLine();
            int leds = 0;

            for (int i = 0; i < numeros.length(); i++) {
                char c = numeros.charAt(i);
                switch (c) {
                    case '1':
                        leds += 2;
                        break;
                    case '2':
                        leds += 5;
                        break;
                    case '3':
                        leds += 5;
                        break;
                    case '4':
                        leds += 4;
                        break;
                    case '5':
                        leds += 5;
                        break;
                    case '6':
                        leds += 6;
                        break;
                    case '7':
                        leds += 3;
                        break;
                    case '8':
                        leds += 7;
                        break;
                    case '9':
                        leds += 6;
                        break;
                    case '0':
                        leds += 6;
                        break;
                }
            }

            System.out.println(leds + " leds");
            n--;
        }

        sc.close();
    }

}
