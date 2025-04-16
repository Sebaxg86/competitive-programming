import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HelpfulMath {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine(), "+", false);

        int n = st.countTokens();
        int[] numbers = new int[n];

        for(int i=0; i<n; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(numbers);

        StringBuilder sb = new StringBuilder();
        sb.append(numbers[0]);

        for(int i = 1; i<numbers.length;i++){
            sb.append("+" + numbers[i]);
        }

        pw.println(sb);
        pw.flush();
    }
}
