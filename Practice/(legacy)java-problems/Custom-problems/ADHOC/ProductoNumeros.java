

import java.util.Scanner;

public class ProductoNumeros {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int total = 1;
        

        for(int i=0; i<n; i++){
            total*=input.nextInt();
        }

        System.out.println(total);

        input.close();
    }
}
