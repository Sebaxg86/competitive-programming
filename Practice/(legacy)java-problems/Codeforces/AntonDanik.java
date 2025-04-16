//-------------------------------- A. Anton and Danik ------------------------------
// --------------------https://codeforces.com/problemset/problem/734/A--------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AntonDanik {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        br.readLine();
        String results = br.readLine();
        int 
            antonWonGames = 0,
            danikWonGames = 0;

        for(int i = 0; i<results.length(); i++){
            if(results.charAt(i) == 'A'){
                antonWonGames++;
            }else{
                danikWonGames++;
            }
        }

        if (antonWonGames > danikWonGames) {
            pw.println("Anton");
        }else if(danikWonGames > antonWonGames){
            pw.println("Danik");
        }else{
            pw.println("Friendship");
        }
        pw.flush();

    }
}
