import java.util.Random;

/*
30 Day Github challenge day 1: A series of exercises from Practice-It with a theme of randomness.
 */
public class Randomness {

    public static void main(String[] args) {
        DiceRoll();         // Exercise 1.
        System.out.println();

        randomX(4, 19);    // Exercise 2.
        System.out.println();

        randomWalk();      // Exercise 3.
        System.out.println();

    }

    /* Exercise 1:
    Roll a six sided die and print out the result until 3 odd numbers have been rolled in a row.
     */
    public static void DiceRoll(){
        System.out.println("Let's roll some dice!");
        Random rand = new Random();
        int numRolls = 0;
        int odds = 0;

        while (odds < 3) {
            numRolls++;
            // roll the die and print its value.
            int roll = rand.nextInt(6) + 1;
            System.out.println("You rolled a " + roll);
            // Check to see if we rolled an odd number.
            if (roll % 2 == 1) {
                odds++;
            } else {
                // even number
                odds = 0;
            }
        }
        System.out.println("Three in a roll after " + numRolls + " rolls");
    }

    /* Exercise 2: Write a method named randomX that keeps printing lines,
   where each line contains a random number of x characters between 5 and 19 inclusive,
   until it prints a line with 16 or more characters.
    */
    public static void randomX(int min, int max){
        // Generate a random number between min and max, inclusive.
        Random rand = new Random();
        int randomNum = 0;
        boolean limit = false;


        while (limit == false){

            randomNum = rand.nextInt((max-min) + 1) + min;

            String string = "";
            for (int i = 1; i <= randomNum; i++) {
                string = string +'x';
            }
            System.out.println(string);

            if (randomNum >= 16)
                limit =true;
        }

    }

    /*
    Exercise 3:
   Write a method named randomWalk that performs a random one-dimensional walk,
   reporting each position reached and the maximum position reached during the walk.
   The random walk should begin at position 0.
   On each step, you should either increase or decrease the position by 1 (with equal probability).
   The walk stops when 3 or -3 is hit.
    */
    public static void randomWalk(){

        Random rand = new Random();

        int position = 0;
        int increment = 0;
        int absolutePosition = 0;
        int max = 0;

        System.out.println("position = " + position);


        while (absolutePosition < 3) {
            int randomStep = rand.nextInt(2); // 0 or 1.

            if (randomStep == 0) {
                increment = 1;
            } else {
                increment = -1;
            }

            position = position + increment;

            if (position > max){
                max = position;
            }

            absolutePosition = Math.abs(position);

            System.out.println("position = " + position);

        }

        System.out.println("max position = " + max);


    }


}