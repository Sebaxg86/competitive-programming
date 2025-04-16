

import java.util.Scanner;

public class RotacionNumeros {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        String number = String.valueOf(n);

        if (number.length() >= 2) {
            // Obtenemos el último dígito y lo ponemos al principio
            String rotacion = number.charAt(number.length() - 1) + number.substring(0, number.length() - 1);
            System.out.println(rotacion);
        } else {
            // Si es un solo dígito, no rotamos nada
            System.out.println(number);
        }

        input.close();
    }
}