package week09;

public class Reverse3 {

    public static void main(String[] args) {

        System.out.println(reverse("Cydeo"));

        System.out.println("reverse(\"cydeo\") = " + reverse("cydeo")); //reverse("cydeo") = oedyc


    }

    public static String reverse( String str){

        String result = "";

        int lastCharIndex = str.length()-1; // str.length()-1 sonucunu, lastCharIndex degiskenine atariz, yani lastCharIndex degiskeni,
                                     //str String'inin son indeksine esit olutr. ör: "cydeo"  str.length()-1 --> index 4, lastCharIndex 4 degerne sahp olur
                                   //cydeo  stringinin son karekteri olan 'o' indeksidir.


        for(int i = lastCharIndex ; i >= 0 ; i--){
            result += str.charAt(i);

        }
        return result;


    }
}
