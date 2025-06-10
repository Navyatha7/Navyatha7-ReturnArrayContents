public class Lab {
    /**
     * Return a string with an array's contents, formatted with spaces.
     * For example, given the array {3,4,5,6} the string should look like this:
     * 3 4 5 6
     *
     * @param nums the array to be manipulated.
     * @return a string representation of all values of nums, with the values separated by spaces.
     */
    public String arrayToString(int[] nums){
        String str = "";
        for (int i = 0; i < nums.length; i++) {
            str += nums[i] + " ";
        }
        return str;
    }
}
