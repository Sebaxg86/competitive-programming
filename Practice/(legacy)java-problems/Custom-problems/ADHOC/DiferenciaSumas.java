

import java.util.Scanner;

public class DiferenciaSumas {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int
            sumaPares = 0,
            sumaImpares = 0;
            

        for(int i=0; i<n; i++){
            int number = input.nextInt();

            if(i%2==0){
                sumaPares += number;
            }else{
                sumaImpares += number;
            }
            
        }    

        System.out.println(sumaPares - sumaImpares);

        input.close();
    }
    
}
