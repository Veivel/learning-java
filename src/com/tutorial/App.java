package com.tutorial;
import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("N-th fibonacci number: ");
        int n = userInput.nextInt();
        System.out.println();

        int first = 0;
        int second = 1;

        int x = 1;
        for (int i = 2; i <= n; i++) {
            x = first + second;
            //System.out.println(x);
            first = second;
            second = x;
        }
        System.out.println(x);
        userInput.close();

        String str = "de";
        String newStr = str.replaceFirst("d", "");
        System.out.println(newStr);
    }

}
