package com.bridgelab.simplelogicprg;

public class ArmstrongNo {
    public static void main(String[] args) {
        int n=371, temp,r,prod=0;
        temp=n;
        while(n!=0)
        {
            r=n%10;
            prod +=Math.pow(r,3);
            n=n/10;
        }
        if(prod==temp)
        {
            System.out.println("Given num is armstrong num:"+temp);
        }
        else {
            System.out.println("Given num is not armstrong num:"+temp);
        }

    }
}
