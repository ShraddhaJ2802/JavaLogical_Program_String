package com.bridgelab.stringlogicprg;
import java.io.*;
import java.util.Scanner;
public class ReverseString {
    // java program to reverse a word
      public static void reverse(String str)
      {
          String nstr="";
          char ch;

          for (int i=0; i<str.length(); i++)
          {
              ch= str.charAt(i); //extracts each character
              nstr= ch+nstr; //adds each character in front of the existing string
          }
          System.out.println("Reversed word: "+ nstr);
      }
        public static void main (String[] args) {

            String str= " good morning";
            System.out.println("Original word: "+str);
            reverse(str);
        }
    }

