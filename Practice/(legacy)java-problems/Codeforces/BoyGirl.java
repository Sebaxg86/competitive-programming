//-------------------------------- A. Boy or Girl ----------------------------------
// --------------------https://codeforces.com/problemset/problem/236/A----------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;

public class BoyGirl {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        HashSet<Character> userChar = new HashSet<>();

        String userName = br.readLine();
        for(int i=0; i<userName.length(); i++){
            userChar.add(userName.charAt(i));
        }
        
        if (userChar.size() % 2 == 0) {
            pw.println("CHAT WITH HER!");
        }else{
            pw.println("IGNORE HIM!");
        }
        pw.flush();
    }
}
