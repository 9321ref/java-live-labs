package week10;

public class UniqueElements2 {
    public static void main(String[] args) {

      String[] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

       for (int i = 0; i < array.length; i++) {

          boolean isUnique = true;
          for (int j = 0; j < array.length; j++) {
            if (i != j && array[i].equals(array[j])) {
                isUnique = false;
       }
    }
             if (isUnique) {
             System.out.println(array[i]);
    }

}

        //OPT2 from Vladimir
//        for (int i = 0; i < array.length; i++) {
//            int freq = 0;
//            for (int j = 0; j < array.length; j++) {
//
//                if (array[i].equals(array[j])) {
//                    freq +=1;
//                }
//            }
//            if (freq == 1) {
//                System.out.println(array[i]);
//            }
//        }



    }
}






