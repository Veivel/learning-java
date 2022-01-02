package com.tutorial;

class Gunpla {
    String grade;
    String model;
    Double price;
    boolean isInProduction;
    Origin gundamOrigin;

    // Gunpla(String grade, String model, Double price, boolean isInProduction){
    //     this.grade = grade;
    //     this.model = model;
    //     this.price = price;
    //     this.isInProduction = isInProduction;
    // idk why 2nd constructor ga bisa call "default" constructor...
    // }

    Gunpla(String grade, String model, Double price, boolean isInProduction, Origin gundamOrigin){
        this.grade = grade;
        this.model = model;
        this.price = price;
        this.isInProduction = isInProduction;
        this.gundamOrigin = gundamOrigin;
    }

    String getGrade() {
        return this.grade;
    }
    String getModel() {
        return this.model;
    }
    Double getPrice() {
        if (this.isInProduction == true) {
            return this.price;
        }
        else {
            return null;
        }
    }
    String getPilot() {
        return this.gundamOrigin.pilot;
    }

    void displayOrigin() {
        this.gundamOrigin.display();
    }

    void setPrice(Double newPrice) {
        this.price = newPrice;
    }

    void display() {
        System.out.println("Model type: " + this.getModel());
        System.out.println("Grade: " + this.getGrade());
        if (this.isInProduction == true) {
            System.out.println("Price: ");
        }
        else {
            System.out.println("Price: null");
        }
        displayOrigin();
    }
}

class Origin {
    String firstAppearance;
    Integer year;
    String pilot;

    Origin(String firstAppearance, Integer year, String pilot) {
        this.firstAppearance = firstAppearance;
        this.year = year;
        this.pilot = pilot;
    }

    void display() {
        System.out.println("First appearance: " + this.firstAppearance);
        System.out.println("Year of origin: " + this.year);
        System.out.println("Pilot name: " + this.pilot);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        Origin rebornOrigin = new Origin("Gundam 00 S2", 2010, "Ribbons Almark");
        Gunpla myGunpla = new Gunpla("HG", "Reborn Gundam", 19.0, false, rebornOrigin);

        myGunpla.setPrice(35.0);
        myGunpla.display();
    }
}
