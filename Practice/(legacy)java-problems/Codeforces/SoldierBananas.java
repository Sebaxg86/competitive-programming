// ------------ A. Soldier and bananas -------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SoldierBananas {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstBanana = Integer.parseInt(st.nextToken());
        int initialDollars = Integer.parseInt(st.nextToken());
        int wantedBananas = Integer.parseInt(st.nextToken());

        int total = 0;

        for(int i=1;i<=wantedBananas;i++){
            total += i*firstBanana;
        }

        if (total>initialDollars) {
            pw.println(total-initialDollars);
        }else{
            pw.println(0);
        }
        pw.flush();
    }
}
