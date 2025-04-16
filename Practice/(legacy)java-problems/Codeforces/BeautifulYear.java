//-------------------------------- A. Beautiful Year -------------------------------
// --------------------https://codeforces.com/problemset/problem/271/A--------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;

public class BeautifulYear {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int year = Integer.parseInt(br.readLine());
        String yearOutput = "";
        
        int sizeCounter = 0;

        while (sizeCounter != 4){
            HashSet<Integer> beautifulYear = new HashSet<>();
            year++;
            String year2 = String.valueOf(year);
            String firstDigit = String.valueOf(year2.charAt(0));
            String secondDigit = String.valueOf(year2.charAt(1));
            String thirdDigit = String.valueOf(year2.charAt(2));
            String forthDigit = String.valueOf(year2.charAt(3));
            
            beautifulYear.add(Integer.parseInt(firstDigit));
            beautifulYear.add(Integer.parseInt(secondDigit));
            beautifulYear.add(Integer.parseInt(thirdDigit));
            beautifulYear.add(Integer.parseInt(forthDigit));

            yearOutput = firstDigit + secondDigit + thirdDigit + forthDigit;

            sizeCounter = beautifulYear.size();
        }

        pw.println(Integer.parseInt(yearOutput));
        pw.flush();
        


    }
}
