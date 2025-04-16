//-------------------------------- A. Hulk -----------------------------------------
// --------------------https://codeforces.com/problemset/problem/705/A--------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Hulk {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sb.append("I hate");
            } else {
                sb.append("I love");
            }

            if (i == n) {
                sb.append(" it");
            } else {
                sb.append(" that ");
            }
        }

        pw.println(sb);
        pw.flush();
        
    }
}
