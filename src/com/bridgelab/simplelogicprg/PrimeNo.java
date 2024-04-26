package com.bridgelab.simplelogicprg;

public class PrimeNo {
    public static void main(String[] args) {
        int n=3, flag=0;
        if(n==0 || n==1)
        {
            System.out.println("Given num is not prime num:" +n);
        }else {
        for(int i=2 ;i<=n-1;i++)
        {
            if(n%i==0)
            {
                flag+=1;
                System.out.println("Given num is not prime num: " +n);
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Given num is prime num: " +n);
        }

        }

    }
}
