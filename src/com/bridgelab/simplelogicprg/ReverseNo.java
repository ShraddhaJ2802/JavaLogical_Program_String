package com.bridgelab.simplelogicprg;

public class ReverseNo {
    public static void main(String[] args) {
        int n = 152, r, sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
            System.out.println("Reverse num is:" + sum);

    }
}
