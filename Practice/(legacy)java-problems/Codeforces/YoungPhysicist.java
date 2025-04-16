import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class YoungPhysicist {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        int sumX = 0, sumY = 0, sumZ = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            sumX += x;
            sumY += y;
            sumZ += z;
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            pw.println("YES");
        } else {
            pw.println("NO");
        }
        pw.flush();
    }
}
