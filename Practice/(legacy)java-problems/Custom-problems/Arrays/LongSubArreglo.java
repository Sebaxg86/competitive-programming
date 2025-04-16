package Subarreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LongSubArreglo {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int length = Integer.parseInt(br.readLine());
        int[] numbers = new int[length];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<numbers.length; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int objective = Integer.parseInt(br.readLine());

        int subLength = Integer.MAX_VALUE;
        boolean flag = false;
        
        
        for(int start = 0; start<numbers.length; start++){
            int actualSum = 0;

            for(int end = start; end<numbers.length; end++ ){
                actualSum += numbers[end];
                
                if(actualSum == objective){
                    flag = true;
                    subLength = Math.min(subLength, end - start +1);
                }
                
            }
        }

        if(flag == false){
            pw.println(-1);
        }else{
            pw.println(subLength);
        }

        pw.flush();
    }
}
