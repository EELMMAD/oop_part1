package se.udemy.elmira.StaticInstanceVariables;

class Dog{
private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName(){
        System.out.println("name = " + name);
    }
}

public class Main {
    public static void main(String[] args) {
    Dog rex = new Dog("rex");  //creates instance (rex)
    Dog fluffy = new Dog("fluffy"); //creates instance (fluffy)

    rex.printName(); //prints fluffy
    fluffy.printName(); //prints fluffy
    }
}


