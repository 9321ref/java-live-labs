package week09;

import java.util.Arrays;

public class ReviewNight {

    public static void main(String[] args) {

        //String: index based, char sequences, not primitive,Object Data Type,String Class in Java

        String str1 = "Cydeo"; // create literal
        String str2 = new String("Cydeo"); // create object

        //str1.length() -1 : takes no parameters

        char[] c = {'C','D','E','O'};

        String school = new String(c);
        System.out.println("school = " + school);
        System.out.println(Arrays.toString(school.toCharArray()));
    }


}
