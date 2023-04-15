import java.util.Arrays;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        ts.sumTwo(nums, target);
    }

    public void sumTwo(int[] numsArray, int target) {
        for(int i = 0; i < numsArray.length; i++) {
            int remainder = target - numsArray[i];
            int indexOfRemainder = Arrays.binarySearch(numsArray, remainder);
            if (indexOfRemainder >= 0 && indexOfRemainder != i) {
                System.out.println("Indices of the two numbers are: " + i + ", " + indexOfRemainder);
                return;
            }
        }
        System.out.println("No two numbers in the array add up to the target value.");
    }
}




