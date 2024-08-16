package week09;

public class Reverse2 {

    public static void main(String[] args) {

        String example = "Cydeo";

        System.out.println("reverse(\"Cydeo\") = " + reverse("Cydeo"));
        System.out.println(reverse("Cydeo"));


    }

    public static String reverse (String original){

        String reverse = "";
        char[] originalCharArray = original.toCharArray();
        for (int i= originalCharArray.length -1 ; i >= 0 ; i--){
            reverse += originalCharArray[i];


        }

        return  reverse;
    }
}
