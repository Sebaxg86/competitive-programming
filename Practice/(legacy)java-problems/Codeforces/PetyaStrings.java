import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetyaStrings {
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string1 = br.readLine();
        String string2 = br.readLine();

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        int comparar = string1.compareTo(string2);

        if (comparar>0) {
            System.out.println(1);
        }else if(comparar<0){
            System.out.println(-1);
        }else{
            System.out.println(0);
        }
    }
}
