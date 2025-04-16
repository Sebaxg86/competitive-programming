import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    public static void main(String args[]){
        
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> problems = new ArrayList<>();
            
            int totalProblems=0;
            int n = input.nextInt();
            input.nextLine();
            
            
            for (int i = 0; i < n; i++) {
                problems.add(input.nextLine());
            }
            
            for (int j = 0; j < problems.size(); j++) {
                int person1 = Integer.parseInt(String.valueOf(problems.get(j).charAt(0)));
                int person2 = Integer.parseInt(String.valueOf(problems.get(j).charAt(2)));
                int person3 = Integer.parseInt(String.valueOf(problems.get(j).charAt(4)));
                
                if (person1 == 1 && person2 == 1 && person3 == 1) {
                    totalProblems++;
                }else if(person1 == 1 && person2 == 1 && person3 == 0){
                    totalProblems++;
                }else if(person1 == 1 && person2 == 0 && person3 == 1){
                    totalProblems++;
                }else if(person1 == 0 && person2 == 1 && person3 == 1){
                    totalProblems++;
                }
                
            }
            
            System.out.println(totalProblems);
        }
        
        
        
    }
}
