
import java.util.Scanner;
public class NumerosPares {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int total = 0;

        for(int i = 0; i<n; i++){
            if(input.nextInt() % 2 == 0){
                total++;
            }
        }
        System.out.println(total);
        input.close();
    }
}
