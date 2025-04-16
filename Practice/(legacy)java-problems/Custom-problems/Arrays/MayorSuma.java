package Subarreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MayorSuma {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int length = Integer.parseInt(br.readLine());
        int[] numbers = new int[length];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int sumaActual = numbers[0];
        int sumaMaxima = numbers[0];

        for(int i=1;i<numbers.length;i++){
            sumaActual = Math.max(numbers[i], sumaActual + numbers[i]);
            sumaMaxima = Math.max(sumaMaxima, sumaActual);
        }

        pw.println(sumaMaxima);
        pw.flush();

    }
}
