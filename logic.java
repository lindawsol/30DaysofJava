/**
 * Created by wangx94 on 10/8/14.
 */
public class Logic {

    public static void main(String[] args) {

        if (luckySum(5, 2, 13) == 7) {
            System.out.println("Yep, it is 7!");
        } else {
            System.out.println("Ah! it didn't work!");
        }


        if (noTeenSum(1, 16, 15) == 32) {
            System.out.println("Yep, it is 32!");
        } else {
            System.out.println("Nope, test failed!");
        };


    }

    /*
    Given 3 int values, a b c, return their sum.
    However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
    So for example, if b is 13, then both b and c do not count.
    TODO: cite source!
     */
    public static int luckySum(int a, int b, int c) {
        if (a == 13) {
            a = 0;
        };
        if (b == 13) {
            b = 0;
        }
        if (c == 13) {
            c = 0;
        };
        int sum = a + b + c;
        return sum;
    }

    /*
    Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive
     -- then that value counts as 0, except 15 and 16 do not count as a teens.
     Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for
     the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
     Define the helper below and at the same indent level as the main noTeenSum().
     Source: http://codingbat.com/prob/p182879
     */

    public static int noTeenSum(int a, int b, int c) {
        int sum = fixTeen(a) + fixTeen(b) + fixTeen(c);
        return sum;
    }

    public static int fixTeen(int n) {
        int actualValue = n;
        if (13 <= n && n <= 19) { // Turns out, 13 <= n <= 19 isn't the correct syntax!
            actualValue = 0;
            if (n == 15 || n == 16 ) {
                actualValue = n;
            }
            }
        return actualValue;
        }

    }

