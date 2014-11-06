/**
 * Created by lindawang on 11/5/14.
 * Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
 * more20(20) → false
 * more20(21) → true
 * more20(22) → true
 */
public class more20 {
    public static void main(String[] args) {
        System.out.println(more20(20));  // false
        System.out.println(more20(21));  // true
        System.out.println(more20(22));  // true
    }
    public static boolean more20(int num){
        if (num%20 == 1 || num%20 == 2)
            return true;
        return false;
    }
}
