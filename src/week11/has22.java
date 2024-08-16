package week11;

public class has22 {
    public static void main(String[] args) {
        System.out.println(has22(new int[]{1, 2, 2, 3, 4, 5, 6, 7, 8, 9}));

    }
    public static boolean has22(int[] nums) {

        //solution1(best way)
        // boolean result= false;
        // for (int i = 0; i<nums.length-1; i++){
        //   if (nums[i]==2 && nums[i+1]==2){
        //       result=true;
        //   }

        // }
        // return result;

        //solution2(ternaries)
        boolean result= false;
        for (int i = 0; i<nums.length-1; i++){
            result= (nums[i]==2 && nums[i+1]==2)? true : result ;

        }
        return result;


        //solution3
// for(int i=0; i<nums.length-1; i++) {
// if(nums[i] == 2) {
// i++;
// if(nums[i] == 2) {
// return true;
// }
// }
// }

// return false;


    }
}

