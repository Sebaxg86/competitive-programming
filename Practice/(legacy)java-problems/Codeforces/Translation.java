//-------------------------------- A. Translation ------------------------------
// --------------------https://codeforces.com/problemset/problem/41/A--------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Translation {
    public static void main (String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringBuilder sb = new StringBuilder(br.readLine());
        String translation = br.readLine();

        if (translation.equals(sb.reverse().toString())) {
            pw.println("YES");
        }else{
            pw.println("NO");
        }
        pw.flush();
    }
}
