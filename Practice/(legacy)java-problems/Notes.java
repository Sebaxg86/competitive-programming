

public class Notes {

    //-------------------- Algortimo que hace la suma total de los digitos de un numero entero -------------------------------
    public static int sumarDigitosNumero(int x){
        
        int suma=0;
        int temporal=x;
        
        while(temporal>0){
            suma += temporal %10;
            temporal /= 10;
        }
        
        return suma;
    }

    //-------------------- Contar cuantos digitos tiene un entero -----------------------------------------------------------
    public int contarDigitos(int n){
        n = 1234;
        int digitos = (int)Math.log10(n)+1;

        return digitos;
    }

    //-------------------- Utilizar dos punteros ----------------------------------------------------------------------------
    public void dosPunteros(int n){
        int[] arreglo = new int[n];
        int left = 0;
        int right = arreglo.length - 1;

        while(left < right){
            //Si quieres recorrer el puntero izquierdo
            left++;
            //Si quieres recorrer el puntero derecho
            right--;
        }
    }

    //-------------------- Revertir una cadena string -----------------------------------------------------------------------
    public String reverse(String word){
        StringBuilder sb = new StringBuilder(word);
        String reversedWord = sb.reverse().toString();

        return reversedWord;
    }

    //-------------------- Kadane´s Algorithm -------------------------------------------------------------------------------
    public int sumaMaximaSubarreglo(int[] nums){

        // Inicializamos la "suma actual" con el primer número del arreglo
        int sumaActual = nums[0];
        // Inicializamos la "suma máxima" con el primer número del arreglo
        int sumaMaxima = nums[0];

        // Recorremos el arreglo desde el segundo elemento
        for (int i = 1; i < nums.length; i++) {
            // Determinamos si es mejor continuar con el subarreglo actual o empezar uno nuevo
            sumaActual = Math.max(nums[i], sumaActual + nums[i]);

            // Actualizamos la suma máxima si encontramos una mayor
            sumaMaxima = Math.max(sumaMaxima, sumaActual);
        }

        // Devolvemos la suma máxima encontrada
        return sumaMaxima;
    }

    //------------------- Fuerza bruta subarreglos -----------------------------------------------------
    public static void fuerzaBrutaSubArreglos(){
        int length = 0;
        int[] numbers = new int[length];

        for(int inicio=0; inicio<numbers.length; inicio++){//Recorre cada inicio de un subarreglo
            for(int fin = inicio; fin<numbers.length; fin++){//A partir del inicio, crea todos los subarreglos en ese inicio
                for(int k = inicio; k<=fin; k++){//Recorre los elementos del subarreglo
                    //Operacion con cada subarreglo
                }
            }
        }
    }
    
}
