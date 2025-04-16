
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in);

        int x = 0,
            y = 0;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int aux = sc.nextInt();
                if (aux==1) {
                    x=i;
                    y=j;
                    break;
                }
            }
        }
    
        int contador=0;
        
        while(x!=2){
            if(x>2){
                contador++;
                x--;
            }else if(x<2){
                x++;
                contador++;
            }
        }
        
        while(y!=2){
            if(y>2){
                contador++;
                y--;
            }else if(y<2){
                y++;
                contador++;
            }
        }
        System.out.println(contador);
        sc.close();
    }
}
