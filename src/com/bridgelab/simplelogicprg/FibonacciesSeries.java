package com.bridgelab.simplelogicprg;

public class FibonacciesSeries {
    public static void main(String[] args) {
        int n1=0, n2=1, count=20,n3;
        System.out.println("Fibonaccies Series is:");
        System.out.print(n1+ " "+n2);
        for(int i=2 ;i<=count;i++)
        {
            n3=n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;

        }

    }
}
