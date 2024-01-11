public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str)); 
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */

    public static String uniqueChars(String oldString) {
        // Replace the following statement with your code
        String newString = "";

        for (int i = 0; i < oldString.length(); i++) {
            char currentChar = oldString.charAt(i);
            if(currentChar != ' ' && newString.indexOf(currentChar) == -1){
                newString = newString + currentChar;
            }  
        }
        return newString;
    }
    
}