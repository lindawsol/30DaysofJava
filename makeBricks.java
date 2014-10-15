/**
 * Created by wangx94 on 10/15/14.
 * We want to make a row of bricks that is goal inches long.
 * We have a number of small bricks (1 inch each) and big bricks (5 inches each).
 * Return true if it is possible to make the goal by choosing from the given bricks.
 * This is a little harder than it looks and can be done without any loops.
 * Source: http://codingbat.com/prob/p183562
 * makeBricks(3, 1, 8) → true
 * makeBricks(3, 1, 9) → false
 * makeBricks(3, 2, 10) → true
 * makeBricks(3, 2, 9) → false
 */
public class makeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
        System.out.println(makeBricks(3, 2, 9));
    }
    public static boolean makeBricks(int small, int big, int goal){
        if (small + Math.min(big, goal/5)*5 >= goal )
            return true;
        return false;
    }


}
