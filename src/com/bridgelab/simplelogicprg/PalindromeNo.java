package com.bridgelab.simplelogicprg;

public class PalindromeNo {
    public static void main(String[] args) {
        int n=151,temp,r,sum=0;
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("Given num is palindrome num:"+temp);
        }
        else {
            System.out.println("Given num is not palindrome num:"+temp);
        }
    }
}
