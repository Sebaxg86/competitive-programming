//-------------------------------- A. Magnets -------------------------------
// --------------------https://codeforces.com/problemset/problem/344/A-------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Magnets {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int magnetsQuantity = Integer.parseInt(br.readLine());
        int firstMagnet = Integer.parseInt(br.readLine());
        int magnetCount = 1;

        for(int i = 0; i<magnetsQuantity-1; i++){
            int magnet = Integer.parseInt(br.readLine());

            if((magnet % 10) != (firstMagnet % 10)){
                magnetCount++;
            }
            firstMagnet = magnet;
        }
        pw.println(magnetCount);
        pw.flush();
    }
}
