//-------------------------------- A. Football -----------------------------
// --------------------https://codeforces.com/problemset/problem/96/A-------
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Football {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String situation = br.readLine();
        boolean isDangerous = false;
        
        for (int start = 0; start <= situation.length() - 7; start++) {
            String sub = situation.substring(start, start + 7);

            if (sub.equals("1111111") || sub.equals("0000000")) {
                isDangerous = true;
                break; 
            }
        }

        if (isDangerous) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }

        pw.flush();
    }
}
