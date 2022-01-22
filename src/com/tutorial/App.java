package com.tutorial;
import java.util.*;

public class App {

    public static Boolean isPalindrome(String str) {
        int L = str.length();

        if (L <= 1) {
            return true;
        }

        String awal = str.substring(0, 1);
        String akhir = str.substring(L - 1, L);
        // System.out.println(awal + " vs. " + akhir);
        // System.out.println("next: " + str.substring(1, L - 1));

        if (awal.equals(akhir)) {
            return isPalindrome(str.substring(1, L - 1));
        }
        else {
            return false;
        }
    }

    public static String getFibonacciSequence(int n) {
        return "0 1" + getFibonacciSequence(n-2, 0, 1);
    }
    public static String getFibonacciSequence(int n, int a, int b) {
        Integer c = a + b;
        String res = " " + c.toString();

        if (n == 0) {
            return res;
        }
        return res + getFibonacciSequence(n-1, b, c);
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        // System.out.println("String to be checked for palindrome-ness:");
        // String inputStr = x.next();
        // System.out.println(isPalindrome(inputStr));

        System.out.println(getFibonacciSequence(5));
        }

}
