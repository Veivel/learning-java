package com.tutorial;
import java.util.*;

public class App {
    
    public static Double calculate(Double a, Double b, String op){
        switch(op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                return 9999999999999.999999999;
        }

    }
    public static void main(String[] args) {
        List<String> validOps = new ArrayList<String>();
        validOps.add("+");
        validOps.add("-");
        validOps.add("*");
        validOps.add("/");

        Scanner userInput = new Scanner(System.in);

        System.out.println();
        System.out.println("First value:");
        Double numA = userInput.nextDouble();
        System.out.println("Second value:");
        Double numB = userInput.nextDouble();
        System.out.println("Operator (+, -, *, /):");
        String operator = userInput.next();

        Double res = calculate(numA, numB, operator);
        String x = validOps.contains(operator) ? res.toString() : "invalid operator";
        System.out.println(x);

        userInput.close();
    }

}
