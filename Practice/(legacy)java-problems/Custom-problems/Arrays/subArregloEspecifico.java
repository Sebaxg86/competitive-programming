package Subarreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.PrintWriter;
import java.util.StringTokenizer;

public class subArregloEspecifico {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter(System.out);

        int length = Integer.parseInt(br.readLine());
        int[] numbers = new int[length];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int k = Integer.parseInt(br.readLine());

        for(int start = 0; start<=numbers.length - k; start++){
            //int actualSum = 0;

            for(int end = start; end<start + k; end++){

            }


        }

    }
}
