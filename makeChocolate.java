/**
 * Created by lindawang on 10/11/14.
 We want make a package of goal kilos of chocolate.
 We have small bars (1 kilo each) and big bars (5 kilos each).
 Return the number of small bars to use, assuming we always use big bars before small bars.
 Return -1 if it can't be done.

 makeChocolate(4, 1, 9) → 4
 makeChocolate(4, 1, 10) → -1
 makeChocolate(4, 1, 7) → 2
 */
public class makeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
    }
    public static int makeChocolate(int small, int big, int goal){
        int result = -1;
        int bigKilo = big*5;
        int inventory = bigKilo + small;
        int enough = goal - inventory;
        if (enough <= 0)
            if (goal-bigKilo <= small)
                result = goal-bigKilo;

        return result;
    }

}
