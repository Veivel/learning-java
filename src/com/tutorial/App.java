package com.tutorial;
import java.util.*;

class Coords {
    Long x;
    Long y;

    Coords(Long x, Long y) {
        this.x = x;
        this.y = y;
    }

    void move(Long a, Long b) {
        this.x += a;
        this.y += b;
    }

    public String display() {
        return x.toString() + ", " + y.toString();
    }

    Boolean compare(Coords otherPoint) {
        if (otherPoint.x == this.x && otherPoint.y == this.y) {
            return true;
        } 
        else {
            return false;
        }
    }

    // only for start
    Boolean checkX(Long targetX) {
        if (this.x == targetX) return true;
        if (this.y == 0) return false;

        if ((targetX - this.x) % this.y == 0) return true;
        else return false;
    }

    Boolean checkY(Long targetY) {
        if (this.y == targetY) return true;
        if (this.x == 0) return false;

        if ((targetY - this.y) % this.x == 0) return true;
        else return false;
    }

}

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
