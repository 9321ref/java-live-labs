package week09;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(palindrome("level"));

    }


    public static boolean palindrome(String str){

        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);

        }
        return reverse.equalsIgnoreCase(str);
    }
}




