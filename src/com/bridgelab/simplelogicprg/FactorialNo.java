package com.bridgelab.simplelogicprg;

public class FactorialNo {
    public static void main(String[] args) {
        int n =4 ,prod =1;
        for(int i=1;i<=n;i++)
        {
            prod*=i;
        }
        System.out.println("Factorial of num " + n +" is "+prod);
    }
}
