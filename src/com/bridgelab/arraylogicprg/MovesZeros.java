package com.bridgelab.arraylogicprg;

public class MovesZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.print("After moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int count = 0; // Count of non-zero elements

        // Traverse the array. If element encountered is non-zero, then replace the element at index 'count' with this element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        // Now all non-zero elements have been shifted to front. We need to fill remaining array with zeros
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }
}
