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

    public static Boolean existsIn(String op, String[] opList) {
        for (String validOperator : opList) {
            if (op.equals(validOperator)) { 
                return true;
            }
        }
        return false;
    }

    public static void prompt() {
        Scanner promptInput = new Scanner(System.in);
        String runAgain;
        
        do {
            System.out.println("\nRun again? (Y/N)");
            runAgain = promptInput.next();
        } 
        while ( !(runAgain.equals("Y") || runAgain.equals("N")) );

        if (runAgain.equals("N")) return;
        else {
            main(null);
        }

    }

    public static void main(String[] args) {
        String[] validOps = {"+","-","*","/"};

        Scanner userInput = new Scanner(System.in);

        System.out.println();
        System.out.println("First value:");
        Double numA = userInput.nextDouble();
        System.out.println("Second value:");
        Double numB = userInput.nextDouble();
        System.out.println("Operator (+, -, *, /):");
        String operator = userInput.next();

        Double res = calculate(numA, numB, operator);
        String x = existsIn(operator, validOps) ? res.toString() : "invalid operator";
        System.out.println(x);

        prompt();
    }

}
