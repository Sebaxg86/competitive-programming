

import java.util.Scanner;

public class SumaMaximaSubarreglo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Entrada del número de elementos del arreglo
        int n = input.nextInt();
        int[] nums = new int[n];

        // Entrada de los números del arreglo
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }

        // Inicializamos sumaActual y sumaMaxima con el primer elemento del arreglo
        int sumaActual = nums[0];
        int sumaMaxima = nums[0];

        // Recorremos el arreglo desde el segundo elemento (i = 1)
        for (int i = 1; i < nums.length; i++) {
            // Calculamos si es mejor continuar con el subarreglo actual o empezar uno nuevo
            sumaActual = Math.max(nums[i], sumaActual + nums[i]);

            // Actualizamos la suma máxima encontrada
            sumaMaxima = Math.max(sumaMaxima, sumaActual);
        }

        // Devolvemos la suma máxima encontrada
        System.out.println("La suma máxima de un subarreglo contiguo es: " + sumaMaxima);

        input.close();
    }
}
