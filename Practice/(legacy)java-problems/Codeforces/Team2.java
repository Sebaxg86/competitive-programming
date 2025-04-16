import java.util.Scanner;
public class Team2 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int total = 0;
            
            for(int i = 0; i<n; i++){
                int petya = input.nextInt();
                int vasya = input.nextInt();
                int tonya = input.nextInt();
                
                if(petya + vasya + tonya >=2){
                    total++;
                }
                
            }

            System.out.println(total);
        }
    }
}
