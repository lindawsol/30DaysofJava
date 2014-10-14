/**
 * Created by lindawang on 10/13/14.
 * When squirrels get together for a party, they like to have cigars.
 * A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
 * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
 * Return true if the party with the given values is successful, or false otherwise.
 * cigarParty(30, false) → false
 * cigarParty(50, false) → true
 * cigarParty(70, true) → true
 *
 */
public class cigarParty {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        boolean result = false;
        if (isWeekend) {
            if (cigars >= 40)
                result = true;
        } else if (cigars >= 40 && cigars <= 60)
            result = true;
        return result;
    }
}
