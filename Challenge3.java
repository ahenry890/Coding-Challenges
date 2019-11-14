class Playground {
    
 /*
 *The method is supposed to replace all of the methods in a string with "%20"
 * Method is applicable even for strings with spaces at the end
 * 
 *
 */
    public static void main(String[ ] args) {
        System.out.println(URLify("Mr John smith    ")); // Mr%20John%20smith
        System.out.println(URLify("This is four words ")); // This%20is%20four%20words
        System.out.println(URLify("Mr professor     ")); 
    }
    
   
     public static String URLify(String word){
        String result = ""; // The new string where the words will be inputed
        String[ ] words = word.split(" "); // splits string into an array 
        for(int i = 0; i < words.length; i++){
            if(i == words.length - 1){
                result += words[i]; // If is the last word then only put in the last word
            }else{
                result += words[i] + "%20";
            }
        }
        return result; 
    }
}
