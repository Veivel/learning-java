package com.tutorial;
// import java.util.*;

public class App {
    public static Boolean isPrime(Integer x) {
        for (int i = 2 ; i < x ; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(2));

        for (int x = 1 ; x < 100; x++){
            if (isPrime(x)) {
                System.out.println(x);
            }
        }
    }

}
