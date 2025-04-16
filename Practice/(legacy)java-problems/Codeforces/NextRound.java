import java.util.Scanner;

public class NextRound {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int participants = input.nextInt();
            int target = input.nextInt();

            int[] scores = new int[participants];

            for(int i = 0; i<participants; i++){
                scores[i] = input.nextInt();
            }

            int targetScore = scores[target-1];

            int totalOutput = 0;
            for(int j = 0; j<scores.length ;j++){

                if (scores[j] >= targetScore && scores[j] > 0) {
                    totalOutput++;
                }

            }
            System.out.println(totalOutput);
        }
        
    }
}
