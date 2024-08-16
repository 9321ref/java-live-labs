package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class Frequency1 {

    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>(Arrays.asList("Apple", "Banana", "Apple", "Cherry","Cherry"));

        for (int i = 0; i < items.size(); i++) {
            String currentItem = items.get(i);
            if (currentItem == null)
                continue;

            int frequency = 0;
            for (int j = 0; j < items.size(); j++) {
                if (currentItem.equals(items.get(j))) {
                    frequency++;
                    items.set(j, null);
                }
            }
            System.out.println(currentItem + " = " + frequency);


        }
    }
}
/*
2. Given an ArrayList of Strings named 'items', write a program that returns the frequency of each element.
	   Example:
	      Input list: {"Apple", "Banana", "Apple", "Cherry"}

	   Output:
	      Apple = 2
	      Banana = 1
	      Cherry = 1
 */