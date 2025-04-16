//-------------------------------- A. Vanya and Fence ------------------------------
// --------------------https://codeforces.com/problemset/problem/677/A--------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class VanyaFence {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberFriends = Integer.parseInt(st.nextToken());
        int fenceHeight = Integer.parseInt(st.nextToken());
        int totalSum = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<numberFriends; i++){
            int currentFriendHeight = Integer.parseInt(st.nextToken());

            if(currentFriendHeight > fenceHeight){
                totalSum+=2;
            }else{
                totalSum+=1;
            }
        }

        pw.println(totalSum);
        pw.flush();
    }
}
