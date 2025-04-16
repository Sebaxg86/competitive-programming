import java.util.Scanner;
public class TheatreSquare {
    public static void main (String args[]){
        try (Scanner input = new Scanner(System.in)) {
            double
                    n = input.nextInt(),
                    m = input.nextInt(),
                    a = input.nextInt();
            double horizontal = Math.ceil(n/a);
            double vertical = Math.ceil(m/a);
            System.out.println(Math.round(horizontal*vertical));
        }
    }
}
