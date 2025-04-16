

import java.util.Scanner;

public class SumParesNones {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int 
            par = 0,
            non = 0;

        for(int i=0; i<n; i++){
            int number = input.nextInt();

            if(number%2 == 0){
                par+=number;
            }else{
                non+=number;
            }
        }
        System.out.println("Suma de Pares: "+par);
        System.out.println("Suma de Impares: "+non);

        input.close();
    }
}
