import java.util.ArrayList;
import java.util.Scanner;

public class Bit_plusplus {
    public static void main(String args[]){

        int total = 0;
        try (Scanner input = new Scanner(System.in)) {
            ArrayList <String> operation = new ArrayList<>();

            int lines = input.nextInt();
            input.nextLine();


            for (int i = 0; i < lines; i++) {
                operation.add(input.nextLine());

                if (operation.get(i).equals("X++") || operation.get(i).equals("++X")) {
                    total++;
                }else{
                    total--;
                }

            }
        }
        System.out.println(total);
    }
}
