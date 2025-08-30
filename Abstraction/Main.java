package Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (no body, must be implemented by subclass)
    abstract void sound();

    // Normal method (can have implementation)
    void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

// Subclass provides implementation of abstract method
class Dog extends Animal {
    void sound() {
        System.out.println("The dog barks: Woof woof!");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("The cat meows: Meow meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();  // Uses Dog's implementation
        myDog.sleep();  // Uses Animal's normal method

        myCat.sound();  // Uses Cat's implementation
        myCat.sleep();  // Inherited from Animal
    }
}
