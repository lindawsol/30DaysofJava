/**
 * Created by lindawang on 11/1/14.
 * Given a number n, return true if n is in the range 1..10, inclusive.
 * Unless "outsideMode" is true, in which case return true if the number is less or equal to 1,
 * or greater or equal to 10.
 * in1To10(5, false) → true
 * in1To10(11, false) → false
 * in1To10(11, true) → true
 */
public class in1to10 {
    public static void main(String[] args) {
        System.out.println(in1To10(5, false));
        System.out.println(in1To10(11, false));
        System.out.println(in1To10(11, true));
    }
    public static boolean in1To10(int n, boolean outsideMode){
        if (!outsideMode){
            if (n >= 1 && n <= 10) {
                return true;
            } else {
                return false;
            }
        } else {
            if (n <= 1 || n >= 10) {
                return true;
            } else {
                return false;
            }
        }
    }
}
