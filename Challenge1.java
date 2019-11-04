/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge1;

/**
 *
 * @author anthonyhenry
 * Checks to see if all the characters in the string are unique
 * First question on Cracking the Coding Interview 6th edition
 */
public class Challenge1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isUnique("dog")); // True
        System.out.println(isUnique("dog and cat")); // False
        System.out.println(isUnique("code fun")); // True
    }
    
        public static Boolean isUnique(String word) {
        int i = 0; 
        Boolean result = true; 
        
        while(i < word.length()){
            
            for(int j = i + 1; j < word.length(); j++){
                if(word.charAt(i) == word.charAt(j)){
                    result = false; 
                }
            }
            if(result == true){
                i++; 
            }else{
                break;
            }
            
        }
        return result; 
    }
    
}
