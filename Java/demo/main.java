package demo;

// Bird class
public class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

// Parrot class inheriting from Bird
class Parrot extends Bird {
    void color() {
        System.out.println("I am Green");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating a Parrot object
        Parrot p = new Parrot();
        p.color();  
        p.fly();    
    }
}