package com.tutorial;
import java.util.*;

public class App {

    public static Boolean isPathPossible(Coords start, Coords target) {
        Boolean xBool = (start.checkX(target.x));
        Boolean yBool = (start.checkY(target.y));
        return xBool && yBool;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Long a = userInput.nextLong();
        Long b = userInput.nextLong();
        Long targetX = userInput.nextLong();
        Long targetY = userInput.nextLong();

        Coords startPoint = new Coords(a, b);
        Coords target = new Coords(targetX, targetY);
        
        System.out.println(isPathPossible(startPoint, target));
        }
}
