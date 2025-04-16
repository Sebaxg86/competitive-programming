import java.util.Scanner;

public class SerejaDima {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] cards = new int[n];
            int SerejaTotal = 0,
                    DimaTotal = 0,
                    left = 0,
                    right = cards.length - 1;
            int turn = 0;
            for (int i = 0; i < cards.length; i++) {
                cards[i] = input.nextInt();
            }
            for (int i = 0; i < cards.length; i++) {

                if (turn % 2 == 0) {
                    if (cards[left] > cards[right]) {
                        SerejaTotal += cards[left];
                        left++;
                    } else {
                        SerejaTotal += cards[right];
                        right--;
                    }
                } else {
                    if (cards[left] > cards[right]) {
                        DimaTotal += cards[left];
                        left++;
                    } else {
                        DimaTotal += cards[right];
                        right--;
                    }
                }
                turn++;
            }
            System.out.println(SerejaTotal + " " + DimaTotal);
        }
    }
}
