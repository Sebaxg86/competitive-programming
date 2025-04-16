//-------------------------------- A. Wrong Subtraction ----------------------------
// --------------------https://codeforces.com/problemset/problem/977/A---------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class WrongSubstraction {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        int subTimes = Integer.parseInt(st.nextToken());

        for(int i = 0; i<subTimes; i++){
            if(number % 10 == 0){
                number /= 10;
            }else{
                number--;
            }
        }
        pw.println(number);
        pw.flush();
    }
}
