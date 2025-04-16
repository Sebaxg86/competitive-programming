import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PlantasVsZombies {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        long zombies = Integer.parseInt(st.nextToken());
        long weapon = Integer.parseInt(st.nextToken());

        long shields = 0;


        st = new StringTokenizer(br.readLine());
        for (long i = 0; i < zombies; i++) {
            long hp = Integer.parseInt(st.nextToken());

            if (hp > weapon) {
                long hits = (long) Math.ceil((double) hp / weapon);
                shields += hits - 1;
            }
        }

        out.println(shields);
        out.flush();
    }
}
