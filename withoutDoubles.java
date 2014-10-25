/**
 * Created by lindawang on 10/24/14.
 *  Return the sum of two 6-sided dice rolls, each in the range 1..6.
 *  However, if noDoubles is true, if the two dice show the same value,
 *  increment one die to the next value, wrapping around to 1 if its value was 6.
 *  withoutDoubles(2, 3, true) → 5
 *  withoutDoubles(3, 3, true) → 7
 *  withoutDoubles(3, 3, false) → 6
 */
public class withoutDoubles {
    public static void main(String[] args) {
        System.out.println(withoutDoubles(2, 3, true));
        System.out.println(withoutDoubles(3, 3, true));
        System.out.println(withoutDoubles(3, 3, false));

    }
    public static int withoutDoubles(int die1, int die2, boolean noDoubles){
        if(noDoubles && die1== die2)
            if (die1 != 6)
                return die1 + 1 + die2;
            else
                return 1 + die2;

        return die1 + die2;


    }
}
