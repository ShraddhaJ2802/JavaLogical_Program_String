package com.bridgelab.arraylogicprg;

public class MissingNo
{
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1)) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        MissingNo solution = new MissingNo();
        int[] nums = {3, 0, 1, 4};
        System.out.println("Missing number: " + solution.missingNumber(nums));
    }
}
