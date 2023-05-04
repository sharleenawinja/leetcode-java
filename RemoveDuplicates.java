// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. 
// The relative order of the elements should be kept the same. 
// Then return the number of unique elements in nums.
// Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
// Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. 
// The remaining elements of nums are not important as well as the size of nums.
// Return k.

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates.removeDuplicates(nums));
    }

    public int removeDuplicates (int[] nums) {
        int uniqueCount = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        System.out.println("Unique count: " + uniqueCount);
        //Arrays.toString is used to print the unique elements of the array
        System.out.println("Unique elements: " + Arrays.toString(nums)); 
        // Arrays.copyOf method is used to create a new array with only the unique elements by setting the length of the array equal to unique count
        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(nums, uniqueCount))); 
        return uniqueCount;
    }
}
