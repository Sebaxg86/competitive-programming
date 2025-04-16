import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SumaArreglo {
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int input = Integer.parseInt(br.readLine());
        int[] array = new int[input];
        int suma = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(st.nextToken());
            suma+=array[i];
        }
        
        pw.println(suma);
        pw.flush();

    }
}
