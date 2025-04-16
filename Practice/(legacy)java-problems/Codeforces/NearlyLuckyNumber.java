//-------------------------------- A. Nearly Lucky Number ----------------------------
// --------------------https://codeforces.com/problemset/problem/110/A--------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class NearlyLuckyNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        long numbers = Long.parseLong(br.readLine());
        long digits = (long)Math.log10(numbers)+1;
        long luckyCount = 0;

        for(int i = 0; i<digits;i++){
            if(numbers % 10 == 7 || numbers % 10 == 4){
                luckyCount++;
            }
            numbers /= 10;
        }
        
        if(luckyCount == 7 || luckyCount == 4){
            pw.println("YES");
        }else{
            pw.println("NO");
        }
        pw.flush();

    }
}
