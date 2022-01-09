package com.tutorial;

 endsWithSameWord(String a, String b) {
    int i = b.indexOf(" ");
    String lastWord = b.substring(i + 1);
    return a.endsWith(lastWord);
}

public class App {
    public static void main(String[] args) {
        String myStr = "hello world!";
        String ourStr = "goodbye world!";

        System.out.println(endsWithSameWord(myStr, ourStr));
    }
}
