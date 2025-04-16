

import java.util.Scanner;

public class CifradoSimple {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);

        String texto = input.nextLine();
        String textoCifrado = "";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (letra >= 'a' && letra <= 'z') {
                if (letra == 'z') {
                    textoCifrado += 'a';
                } else {
                    textoCifrado += (char) (letra + 1);
                }
            } else {
                textoCifrado += letra;
            }
        }
        System.out.println(textoCifrado);
        input.close();
    }
}
