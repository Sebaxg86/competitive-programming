import java.util.ArrayList;
import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String args[]) {

        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> words = new ArrayList<>();
            
            int lines = input.nextInt();
            input.nextLine();

            for (int i = 0; i < lines; i++) {
                words.add(input.nextLine());
            }
            
            for (int j = 0; j < words.size(); j++) {
                
                if (words.get(j).length() > 10) {
                    char firstLetter = words.get(j).charAt(0);
                    char lastLetter = words.get(j).charAt(words.get(j).length() - 1);
                    int between = (words.get(j).length()) - 2;
                    
                    String abbWord = firstLetter + "" + between + "" + lastLetter;
                    System.out.println(abbWord);
                }else{
                    System.out.println(words.get(j));
                }
            }
        }
    }
}
