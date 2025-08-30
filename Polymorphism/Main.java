package Polymorphism;

// Parent class
class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclasses override the sound()
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Parent type reference, Child type object
        Animal myAnimal;

        myAnimal = new Dog();
        myAnimal.sound();  // "Dog barks: Woof!"

        myAnimal = new Cat();
        myAnimal.sound();  // "Cat meows: Meow!"
    }
}

