//-------------------------------- A. Word -----------------------------------------
// --------------------https://codeforces.com/problemset/problem/59/A---------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Word {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String s = br.readLine();
        int upper = 0;
        int lower = 0;

        for(int i = 0; i<s.length(); i++){
            String aux = s.charAt(i)+"";
            if(aux.equals(aux.toUpperCase())){
                upper++;
            }else{
                lower++;
            }
        }

        if (lower > upper || lower == upper) {
            pw.println(s.toLowerCase());
        }else{
            pw.println(s.toUpperCase());
        }
        pw.flush();
    }
}
