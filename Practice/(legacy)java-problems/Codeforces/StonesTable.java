//-------------------------------- A. Stones on the Table ---------------------------
// --------------------https://codeforces.com/problemset/problem/266/A---------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class StonesTable {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        String stonesInput = br.readLine();
        
        char[] stones = new char[n];
        stones = stonesInput.toCharArray();
        int counter = 0;
        int size = stones.length - 1;

        for(int i = 0; i<size; i++){
            if(stones[i] == stones[i+1]){
                counter++;
            }
        }
        pw.println(counter);
        pw.flush();        
    }
}
