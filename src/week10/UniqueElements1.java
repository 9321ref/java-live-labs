package week10;

import java.util.Arrays;

public class UniqueElements1 {

    public static void main(String[] args) {

        String[] array ={"Java","Python","Python","Ruby","Ruby","C#"};
        System.out.println(Arrays.toString(array));  // array yazdirdik görmek icin

        Arrays.sort(array); //[C#, Java, Python, Python, Ruby, Ruby] --> ayni elementleri önce düzene koyup unique elementi bulcaz
        System.out.println(Arrays.toString(array));

        for(int i = 0; i< array.length; i++){
            if( i==0 && !array[i].equals(array[i+1]) || !array[i].equals(array[i-1]) && !array[i].equals(array[i+1]) ){
                System.out.println(array[i]);
            }
        }
// java önce and conditions kontrol eder sonra Logical Or kontrol edr

    }
}
