//-------------------------------- A. Bear and Big Brother --------------------------
// --------------------https://codeforces.com/problemset/problem/791/A---------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class BearBigBrother {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int limak = Integer.parseInt(st.nextToken());
        int bob = Integer.parseInt(st.nextToken());

        int counter = 0;
        while(limak <= bob){
            limak *= 3;
            bob *= 2;
            counter++;
        }

        pw.println(counter);
        pw.flush();
    }
}
