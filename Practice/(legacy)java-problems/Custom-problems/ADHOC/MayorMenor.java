

import java.util.Scanner;

public class MayorMenor {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(),
                mayor = Integer.MIN_VALUE,
                menor = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            if (number > mayor) {
                mayor = number;
            }

            if (number < menor) {
                menor = number;
            }
        }

        System.out.print(mayor + " " + menor + " ");

        input.close();
    }
}
