//-------------------------------- A. Word Capitalization ----------------------------------
// --------------------https://codeforces.com/problemset/problem/281/A----------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WordCapitalization {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String input = br.readLine();

        StringBuilder sb = new StringBuilder();

        sb.append(input.toUpperCase().charAt(0));
        for(int i = 1; i<input.length(); i++){
            sb.append(input.charAt(i));
        }

        pw.println(sb);
        pw.flush();
        
    }
}
