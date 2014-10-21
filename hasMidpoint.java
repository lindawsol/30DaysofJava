/**
 * Created by lindawang on 10/20/14.
 * Write a method named hasMidpoint that accepts three integers as parameters and returns true if one of the integers
 * is the midpoint between the other two integers; that is, if one integer is exactly halfway between them.
 * Your method should return false if no such midpoint relationship exists.
 * The integers could be passed in any order; the midpoint could be the 1st, 2nd, or 3rd.
 * You must check all cases.
 * Calls such as the following should return true.
 * hasMidpoint(4, 6, 8)
 * hasMidpoint(2, 10, 6)
 * hasMidpoint(8, 8, 8)
 * hasMidpoint(25, 10, -5)
 * Calls such as the following should return false:
 * hasMidpoint(3, 1, 3)
 * hasMidpoint(1, 3, 1)
 * hasMidpoint(21, 9, 58)
 * hasMidpoint(2, 8, 16)
 *
 */
public class hasMidpoint {
    public static void main(String[] args) {
        System.out.println(hasMidpoint(4, 6, 8));
        System.out.println(hasMidpoint(2, 10, 6));
        System.out.println(hasMidpoint(8, 8, 8));
        System.out.println(hasMidpoint(25, 10, -5));
        System.out.println(hasMidpoint(3, 1, 3));
        System.out.println(hasMidpoint(1, 3, 1));
        System.out.println(hasMidpoint(21, 9, 58));

    }
    public static boolean hasMidpoint(int a, int b, int c){
        double midpoint = (a + b + c)/3.0;
        if (a == midpoint || b == midpoint || c == midpoint)
            return true;
        return false;

    }

}
