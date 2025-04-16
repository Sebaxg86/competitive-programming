

import java.util.Scanner;

public class TransformarCadena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de la cadena de texto
        System.out.println("Ingresa la cadena de texto:");
        String texto = input.nextLine();

        // Entrada del carácter de reemplazo
        System.out.println("Ingresa el carácter de reemplazo:");
        char reemplazo = input.next().charAt(0);

        // Creamos un StringBuilder para construir la nueva cadena
        StringBuilder nuevaCadena = new StringBuilder();

        // Recorremos cada carácter de la cadena original
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            // Verificamos si la letra es una vocal
            if ("AEIOUaeiou".indexOf(letra) != -1) {
                nuevaCadena.append(reemplazo);  // Reemplazamos la vocal
            } else {
                nuevaCadena.append(letra);  // Si no es vocal, la dejamos igual
            }
        }

        // Devolvemos la cadena transformada
        System.out.println("Cadena transformada: " + nuevaCadena.toString());
        input.close();
    }
}
