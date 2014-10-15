/**
 * Created by wangx94 on 10/15/14.
 * Write a method named allDigitsOdd that returns whether every digit of a given integer is odd.
 * Your method should return true if the number consists entirely of odd digits and false if any of its digits are even.
 * 0, 2, 4, 6, and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits.
 * Your method should work for positive and negative numbers.
 * Source: BJP3 Exercise 5.22: allDigitsOdd
 *
 */
public class allDigitsOdd {
    public static void main(String[] args) {
        System.out.println(allDigitsOdd(4822116)); // false
        System.out.println(allDigitsOdd(135319));  // true
        System.out.println(allDigitsOdd(9175293)); // false
        System.out.println(allDigitsOdd(-137));    // true
        System.out.println(allDigitsOdd(0));      // false
    }

    public static boolean allDigitsOdd(int a) {
        a = Math.abs(a);
        if (a == 0)
            return false;
        while (a > 0){
            int digit = a % 10;
            if (digit % 2 == 0)
                return false;
            a = a/10;
        }
        return true;

    }


}
