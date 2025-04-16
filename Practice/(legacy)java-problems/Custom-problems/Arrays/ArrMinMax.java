import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ArrMinMax {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int length = Integer.parseInt(br.readLine());
        int[] numbers = new int[length];

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
            
            if(numbers[i] > max){
                max = numbers[i];
            }
            
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        pw.println("El número mínimo es: "+min);
        pw.println("El número máximo es: "+max);
        pw.flush();

    }
}
