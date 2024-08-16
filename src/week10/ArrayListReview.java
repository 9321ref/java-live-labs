package week10;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReview {


    public static void main(String[] args) {

        ArrayList<Object> list1 = new ArrayList<Object>();
        list1.add("Cydeo");
        list1.add(25);                      //-->int     Autoboxing yapmadan 25 Object liste ekledignde Error verir
        list1.add(Integer.valueOf(25));   //--Integer  int --> Wrapper class Objecte cevirmek lazim --> Integer
        list1.add(2024L);
        System.out.println("list1 = " + list1);

        ArrayList<String> languages = new ArrayList<>();

        languages.addAll(Arrays.asList("java", "Python", "Ruby", "C#"));
        System.out.println(languages.size());    // size() kocdu  olmasa listede ki elementleri yazdircak

        System.out.println("languages.contains(\"C#\") = " + languages.contains("C#"));

        System.out.println("languages.indexOf(\"C#\") = " + languages.indexOf("C#"));

        int lastElementIndex = languages.size() - 1;

        System.out.println("lastElementIndex = " + lastElementIndex);

        for (int i = 0; i <= languages.size() - 1; i++) {

            System.out.println(languages.get(i));
        }

    }
}

