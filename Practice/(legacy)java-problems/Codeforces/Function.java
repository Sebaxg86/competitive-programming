import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Function {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        long n = Long.parseLong(br.readLine());

        if(n%2==0){
            pw.println(n/2);
        }else{
            pw.println(-(n/2 + 1));
        }
        pw.flush();
    }
}
