import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Elephant {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int input = Integer.parseInt(br.readLine());
        int step = 0;

        if(input % 5 == 0){
            step = input / 5;
        }else{
            step++;
            step = step + input / 5;
        }

        pw.println(step);
        pw.flush();
    }
}
