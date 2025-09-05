package Polymorphism;

// Parent class
class Pet {
    void sound() {
        System.out.println("Some generic animal sound.");
    }
}

// Subclasses override the sound()
class Dog extends Pet {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Pet {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Parent type reference, Child type object
        Pet myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();  // "Dog barks: Woof!"

        myAnimal = new Cat();
        myAnimal.sound();  // "Cat meows: Meow!"
    }
}

