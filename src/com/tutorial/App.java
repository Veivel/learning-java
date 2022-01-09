package com.tutorial;

public class App {
    
    // method that returns true/false if a & b end with the same word.
    public static Boolean endsWithSameWord(String a, String b) {
        int i = b.indexOf(" ");
        String lastWord = b.substring(i + 1);
        return a.endsWith(lastWord);
    }
    public static void main(String[] args) {
        String myStr = "hello world!";
        String ourStr = "goodbye world!";
        String newStr = "world! lol.";
        String xStr = "world!";

        System.out.println(endsWithSameWord(xStr, myStr));
    }
}
