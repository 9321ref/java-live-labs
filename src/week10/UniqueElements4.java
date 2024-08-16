package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements4 {


    public static void main(String[] args) {


        String[] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        ArrayList<String> uniqueElement = new ArrayList<>(Arrays.asList(array));

        for (String each : array) {
            if (uniqueElement.indexOf(each) == uniqueElement.lastIndexOf(each)) {
                System.out.println(each);

            }
        }
    }
}