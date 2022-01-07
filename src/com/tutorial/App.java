package com.tutorial;

class formulaCar {
    Pilot driver;
    private String carClass;
    private String engine;
    private Integer topSpeed;
    String lapTime;

    public formulaCar(Pilot driver, String carClass, String engine, Integer topSpeed, String lapTime) {
        this.driver = driver;
        this.carClass = carClass;
        this.engine = engine;
        this.topSpeed = topSpeed;
    }

    String getEngine() {
        return this.carClass + "-type engine: " + this.engine;
    }

    Integer getTopSpeed() {
        return this.topSpeed;
    }

    // no need laptime getter-setters
}

class Pilot {
    private String name;
    private Integer age;
    private Boolean hasSuperLicense;
    
    public Pilot(String name, Integer age, Boolean hasSuperLicense) { 
        this.name = name;
        this.age = age;
        this.hasSuperLicense = hasSuperLicense;
    }

    public Pilot(String name, Integer age) {
        this(name, age, true);
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Has super license: " + this.hasSuperLicense);
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;   
    }

    public Boolean checkSuperLicense() {
        return this.hasSuperLicense;
    }

    void giveSuperLicense() {
        this.hasSuperLicense = true;
    }
    
    void revokeSuperLicense() {
        this.hasSuperLicense = false;
    }

}

public class App {
    public static void main(String[] args) {
        Pilot LEC = new Pilot("Charles Leclerc", 22);
        formulaCar SF90 = new formulaCar(LEC, "F1", "Ferrari 2020", 387, "1:33:12");

        SF90.driver.display();
    }
}
