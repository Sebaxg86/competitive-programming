import java.util.Scanner;

public class Domino_piling {
    public static void main(String args[]) {

        try (Scanner input = new Scanner(System.in)) {
            int m = input.nextInt(), n = input.nextInt();
            int maxArea = m * n,
                    dominoArea = 2,
                    maxDominoes = 0;
            while (maxArea >= dominoArea) {
                maxArea -= dominoArea;
                maxDominoes++;
            }
            System.out.println(maxDominoes);
        }
    }
}
