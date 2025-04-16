//-------------------------------- A. In Search of an Easy Problem -------------------------------
// --------------------https://codeforces.com/problemset/problem/1030/A---------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class EasyProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            sum += Integer.parseInt(st.nextToken());
        }

        if(sum == 0){
            pw.println("EASY");
        }else{
            pw.println("HARD");
        }
        pw.flush();


    }
}
