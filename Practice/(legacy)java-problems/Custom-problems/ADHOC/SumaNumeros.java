
import java.util.Scanner;
public class SumaNumeros {
    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int suma = 0;

        for(int i=0; i<n; i++){
            suma+=input.nextInt();
        }

        System.out.println(suma);

        input.close();
    }
}
