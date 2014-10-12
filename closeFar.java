/**
 * Created by lindawang on 10/11/14.
 Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
 while the other is "far", differing from both other values by 2 or more.
 Note: Math.abs(num) computes the absolute value of a number.

 closeFar(1, 2, 10) → true
 closeFar(1, 2, 3) → false
 closeFar(4, 1, 3) → true
 Source: http://codingbat.com/prob/p138990
 */
public class closeFar {

    public static void main(String[] args) {
        System.out.println(closeFar(1, 2, 10));
        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(4, 1, 3));

    }
    public static boolean closeFar(int a, int b, int c){
        boolean result = false;
        if (Math.abs(b-a)==1 || Math.abs(c-a)==1){
            if (Math.abs(b-a)==1){
                if (Math.abs(c-a) >= 2 && Math.abs(c-b) >= 2)
                    result = true;
            } else if (Math.abs(c-a)==1)
                if (Math.abs(b-a) >= 2 && Math.abs(b-c) >= 2)
                    result = true;
        }


        return result;

    }

}
