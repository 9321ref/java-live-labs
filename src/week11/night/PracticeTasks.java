package week11.night;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PracticeTasks {

    public static void main(String[] args) {
        String str1 = "HiAbc";
        System.out.println(str1.endsWith("abc"));
        String str2 = "abc";
        System.out.println(endOther(str1,str2));

        int [] arr = {1,2,1,3,4};
        System.out.println(isEveryWhere(arr,1));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(7,7,3,4,8,9));
        System.out.println(findSecondMax(numbers));

        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(numbers.get(numbers.size()-2));
        Collections.reverse(numbers);
        System.out.println(numbers);
        System.out.println(numbers.get(1));

        int [][] arr2D = {
                {3,4,5,6},
                {1,5,7,9}
        };
        System.out.println(Arrays.deepToString(arr2D)); // multidimesional arrays
        System.out.println(Arrays.toString(arr)); // 1 dimesional array

    }

    public static boolean endOther(String s1, String s2){
        //  s1 = s1.toLowerCase();
        //  s2 = s2.toLowerCase();
        //  boolean result = s1.endsWith(s2) || s2.endsWith(s1);
        return s1.toLowerCase().endsWith(s2) || s2.toLowerCase().endsWith(s1);
    }

    public static boolean isEveryWhere(int [] arr, int val){
        for(int i = 0; i < arr.length -1 ; i++){
            int p1 = arr[i];
            int p2 = arr[i+1];
            // 3 ,4  -- 1
            if(p1 != val && p2 != val){
                return false;
            }
        }
        return true;
    }

    public static int findSecondMax(ArrayList<Integer> numbers){
        int maxNumber = numbers.get(0);
        int secondMaxNumber = numbers.get(0);

        for (Integer number : numbers) {
            // when we find new max number we need to transfer the previous one to secondMax
            if(number > maxNumber){
                secondMaxNumber = maxNumber ;
                maxNumber = number;
                // we need to check if the next number in the list falls between secondMax and maxNumber
            } else if (number > secondMaxNumber && number < maxNumber) {
                secondMaxNumber = number;
            }
        }
        return secondMaxNumber;
    }

}
