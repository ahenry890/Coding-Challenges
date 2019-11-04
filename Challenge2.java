/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge2;

/**
 *
 * @author anthonyhenry
 */
import java.util.Arrays;
public class Challenge2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println(permutation("ABC", "CBA")); // True
        System.out.println(permutation("DOG", "DGO")); // True
        System.out.println(permutation("CBA", "DOG")); // False
        System.out.println(permutation("DOG", "DG")); // False
    }
    
       public static Boolean permutation(String a, String b){
        // If the length are not the same the it cannot be permutation
        if(a.length() == b.length()){
            String order1 = "";
            String order2 = ""; 
            // Turns string into character array then sorts in alaphabetical order
            char[] charArray1 = a.toCharArray(); 
            char[] charArray2 = b.toCharArray(); 
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            for(int i =0; i < charArray1.length; i++){
                // takes value of array and turns it back into string
                order1 += charArray1[i]; 
                order2 += charArray2[i]; 
            }
            //Checks to see if strings qual each other
            if(order1.equals(order2)){
                return true;
            }
            else{
                return false; 
            }
            
        }else{
            return false; 
        }
    }
    
}
