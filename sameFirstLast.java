/**
 * Created by lindawang on 10/21/14.
 * Given an array of ints, return true if the array is length 1 or more,
 * and the first element and the last element are equal.
 * sameFirstLast({1, 2, 3}) → false
 * sameFirstLast({1, 2, 3, 1}) → true
 * sameFirstLast({1, 2, 1}) → true
 */
public class sameFirstLast {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};
        System.out.println(sameFirstLast(array));
    }
    public static boolean sameFirstLast(int[] nums ){
        if (nums.length >=1)
            if (nums[0] == nums[nums.length - 1])
                return true;
        return false;
    }
}
