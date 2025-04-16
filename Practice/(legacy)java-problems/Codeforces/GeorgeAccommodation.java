//-------------------------------- A. George and Accommodation -------------------------------
// --------------------https://codeforces.com/problemset/problem/467/A---------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GeorgeAccommodation {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int rooms = Integer.parseInt(br.readLine());
        int availableRooms = 0;

        for(int i = 0; i<rooms; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int occupiers = Integer.parseInt(st.nextToken());
            int roomSize = Integer.parseInt(st.nextToken());

            if((roomSize - occupiers) >= 2){
                availableRooms++;
            }
        }
        pw.println(availableRooms);
        pw.flush();
    }
}
