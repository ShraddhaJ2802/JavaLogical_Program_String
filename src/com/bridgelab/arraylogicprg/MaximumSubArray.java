package com.bridgelab.arraylogicprg;
import java.io.*;
import java.util.*;

public class MaximumSubArray {
    // Java program to print largest contiguous array sum
        public static void main(String[] args)
        {
            int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
            System.out.println("Maximum contiguous sum is "
                    + maxSubArraySum(a));
        }

        // Function Call
        static int maxSubArraySum(int a[])
        {
            int size = a.length;
            int max_sum = 0,current_sum= 0;

            for (int i = 0; i < size; i++) {
               current_sum =current_sum + a[i];
                if (max_sum <current_sum)
                    max_sum =current_sum;
                if (current_sum < 0)
                   current_sum = 0;
            }
            return max_sum;
        }
    }

