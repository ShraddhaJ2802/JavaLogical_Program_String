package com.bridgelab.arraylogicprg;
public class TwoSumIndices {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        int target = 7;
        int[] ans =new int[2];
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        System.out.println("Two sum indices are:");
        for (int k=0; k<ans.length;k++)
        {
            System.out.print(ans[k]+" ");
        }
    }
}
