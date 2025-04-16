import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class adivinanza {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        

        int vidas = 3;
        int numero = 0;
        int objetivo = rnd.nextInt(11);

        while(numero != objetivo && vidas > 0){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero!"));

            if(vidas > 0){
                if(numero > objetivo){
                    vidas--;
                    JOptionPane.showMessageDialog(null, "Te pasaste!, quedan "+vidas+" vidas.");
                    
                }else if(numero < objetivo){
                    vidas--;
                    JOptionPane.showMessageDialog(null, "Te falta!, quedan "+vidas+" vidas.");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Lo lograste!, el numero era: "+objetivo);
                }
            }
        }
        input.close();
    }
}
