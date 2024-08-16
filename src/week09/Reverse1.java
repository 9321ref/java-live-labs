package week09;

import java.util.Locale;

public class Reverse1 {
    public static void main(String[] args) {

        System.out.println(reverse("cydeo"));

        System.out.println(isPalindrome("dad"));

        System.out.println(frequency("aabbbcccc"));
    }

    public static String reverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String str) {

        boolean result = false; // -- check point
        // handle case of the string,reverse the String -then compare original to reversed one

        str = str.toLowerCase();
        if (reverse(str).equals(str)) {
            result = true;
        }
        return result;
    }



    public static String frequency(String input){
        String result = ""; // result (bucket) char and how many it repeats
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            int counter = 0;
            for(int j = 0; j < input.length(); j++){
                if(c == input.charAt(j)){
                    counter++;
                }
            }
//            if(result.contains(""+c)){
//                continue;
//            }
            if(!result.contains(""+c)){
                result += "" + c + counter;
            }
        }
        return result;
    }


}





/*
 Create a method to reverse a given string and provide the reversed result.
			Example:
			 	reverse("Cydeo");
			Output:
			 	"oedyC"
 */