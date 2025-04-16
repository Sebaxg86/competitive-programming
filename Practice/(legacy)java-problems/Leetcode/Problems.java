package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;


public class Problems {

    
    
    public static void main(String[] args) {
    }
    
    //-------------------------------- 9. ---------------------------------
    public boolean isPalindrome(int x) {
        
        String cuerda = x+"";
        
        int i=0;
        int j=cuerda.length()-1;
        
        while(i<=j){    
            if (cuerda.charAt(i) == cuerda.charAt(j)) {        
                i++;
                j--;        
            }else{
                return false;
            }    
        }
    return true;    
    }
    
    //--------------------------------- 58. ---------------------------------
    public int lengthOfLastWord(String s) {
        
        String[] parts = s.split(" ");
        
        return parts[(parts.length)-1].length();
    }
    
    //--------------------------------- 13. ---------------------------------
    public int romanToInt(String s){
        
        HashMap<Character, Integer> diccionarioRomano = new HashMap<>();
        
        int total = 0;
        
        diccionarioRomano.put('I', 1);
        diccionarioRomano.put('V', 5);
        diccionarioRomano.put('X', 10);
        diccionarioRomano.put('L', 50);
        diccionarioRomano.put('C', 100);
        diccionarioRomano.put('D', 500);
        diccionarioRomano.put('M', 1000);
        
        // Reemplazo de combinaciones específicas de números romanos
        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");
        
        // Suma los valores correspondientes
        for (int i = 0; i < s.length(); i++) {
            total += diccionarioRomano.get(s.charAt(i));
        }

        return total;
    }
    
    //--------------------------------- 1929. ---------------------------------
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int [] ans = new int[2 * n];
        int j = 0;
        
        for (int i = 0; i < ans.length; i++) {
            if (i<nums.length) {
                ans[i] = nums[i];
            }else{
                ans[i] = nums[j];
                j++;
            }    
        }
        
        return ans;
    }
    
    //--------------------------------- 2469. ---------------------------------
    public double[] convertTemperature(double celsius) {
        
        double [] ans = new double [2];
        
        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32;
        
        return ans;
    }
    
    //--------------------------------- 2235. ---------------------------------
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
    
    //--------------------------------- 709. ---------------------------------
    public String toLowerCase(String s) {
        return s.toLowerCase();
    }
    
    //--------------------------------- 3099. ---------------------------------
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        
        String number = String.valueOf(x);
        ArrayList<String> digits = new ArrayList<>(); 
        int suma=0;
        int sum = 0;
        
        for (int i = 0; i < number.length(); i++) {
            digits.add(String.valueOf(number.charAt(i)));
        }
        
        for (int j = 0; j < digits.size(); j++) {
            suma += Integer.parseInt(digits.get(j));
        }
        
        if (x % suma == 0) {
            sum = suma;
            return sum;
        }else{
            return -1;
        }
    }
    
    //--------------------------------- 11. ---------------------------------
    public int maxArea(int[] height) {
        int maxArea=0;
        int left = 0;
        int right = height.length-1;

        while(left<right){
            int distanceBetweeen = right - left;
            int currentArea = Math.min(height[left], height[right]) * (distanceBetweeen);
            if(currentArea > maxArea){
                maxArea = currentArea;
            }
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        
        return  maxArea;
    }
    
    //--------------------------------- 1. ---------------------------------
    public int[] twoSum(int[] nums, int target){
        
        int[] resultado = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                
                if (nums[i] + nums[j] == target) {
                    resultado[0] = i;
                    resultado[1] = j;
                    return resultado;
                }
                
            }
        }
        
        return resultado;
    }
    
    //--------------------------------- 27. ---------------------------------
    public int removeElement(int[] nums, int val){
        int contador=0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[i] = nums[contador];
                contador++;
            }
        }
        
        return contador;
    }

    //--------------------------------- 1071. -------------------------------
    public String gcdOfStrings(String str1, String str2) {
        String s = "";



        return s;
    }
    
    
    
    
}
