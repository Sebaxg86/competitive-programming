import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BusquedaArreglo1 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int size = Integer.parseInt(br.readLine());
        int[] numbers = new int[size];


        StringTokenizer arrayNumbers = new StringTokenizer(br.readLine());
        int objective = Integer.parseInt(br.readLine());

        boolean found =false;

        for(int i=0; i<numbers.length; i++){
            numbers[i] = Integer.parseInt(arrayNumbers.nextToken());

            if (numbers[i] == objective) {
                pw.println("El numero "+objective+" esta en la posicion "+i);
                pw.flush();

                found = true;
                break;
            }

        }

        if (!found) {
            pw.println("El numero "+objective+" no se encuentra en el arreglo");
            pw.flush();
        }


    }
}
