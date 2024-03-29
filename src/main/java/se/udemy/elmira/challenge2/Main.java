package se.udemy.elmira.challenge2;

public class Main {
    // Start with a base class of a Vehicle, then create a car class that inherits from this base class.
    //Finally,create another class, a specific type of Car that inherits from the Car class
    //You should be able to hand steering, changing gears, and moving (speed in other words).
    //You will want to decide where to put the appropriate state and behaviours (fields and methods).
    //As mentioned above, changing gears, increasing/decreasing speed should be included.
    //For you specific type of vehicle you will want to add something specific for that type of car.

    public static void main(String[] args) {
        Outlander outlander = new Outlander(36);
        System.out.println("_________________________");
        outlander.steer(45);
        outlander.accelerate(30);
        System.out.println("_________________________");
        outlander.accelerate(20);
        System.out.println("_________________________");
        outlander.accelerate(-42);
    }
}
