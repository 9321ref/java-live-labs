package week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements3 {

    public static void main(String[] args) {

        String[] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};
        ArrayList<String> newArray = new ArrayList<>(Arrays.asList(array));

        newArray.removeIf(p-> Collections.frequency(newArray,p)!=1);
        System.out.println(newArray);
    }
}
