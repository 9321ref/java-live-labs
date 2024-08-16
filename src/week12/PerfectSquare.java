package week12;

public class PerfectSquare {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare01(49));
        System.out.println(isPerfectSquare02(49));
        System.out.println(isPerfectSquare01(85));
        System.out.println(isPerfectSquare02(85));

    }

    // using ready Math.srt()
    public static boolean isPerfectSquare01(double n){
        int root = (int) Math.sqrt(n);
        System.out.println("root = " + root);
        return root * root == n;
    }

    /* not using Math library
     * 49  - input
     * 1 * 1 = 1
     * 2 * 2 = 4
     * ....
     * 7 * 7 = 49 - result
     * if input == result
     * */
    public static boolean isPerfectSquare02(int input){ // 49
        int root = 1;
        int result = 1;
        while (result < input){ // root=9 result 81, input=85
            result = root * root;
            System.out.println("DEBUG: " + root + " " + result );
            root++;
        }
        return result == input;
    }


}

