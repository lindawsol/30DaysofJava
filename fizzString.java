/**
 * Created by lindawang on 10/19/14.
 * Given a string str, if the string starts with "f" return "Fizz".
 * If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz".
 * In all other cases, return the string unchanged. (See also: FizzBuzz Code)
 * fizzString("fig") → "Fizz"
 * fizzString("dib") → "Buzz"
 * fizzString("fib") → "FizzBuzz"
 */
public class fizzString {
    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }
    public static String fizzString(String str){
        Boolean Fizz = false;
        Boolean Buzz= false;

        if (str.charAt(0) == 'f')
             Fizz = true;
        if (str.charAt(str.length() - 1) == 'b')
            Buzz = true;

        if (Fizz)
            return "Fizz";
        if (Buzz)
            return "Buzz";
        if (Fizz && Buzz)
            return "FizzBuzz";

        return str;
    }
}
