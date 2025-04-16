package Subarreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SumaSubArreglo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int length = Integer.parseInt(br.readLine());
        int[] numbers = new int[length];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int sum = 0;

        while(start<=end){
            sum += numbers[start];
            start++; 
        }

        pw.println("La suma del subarreglo es: "+sum);
        pw.flush();
    }
}
