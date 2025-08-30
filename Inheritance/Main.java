package Inheritance;

// Parent class (Super class)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating...");
    }
}

// Child class (Subclass) inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking!");
    }
}

// Subclass of Dog (inherits from Dog, which already inherits from Animal)
// class Puppy extends Dog {
//     void weep() {
//         System.out.println("The puppy is weeping.");
//     }
// }

public class Main {
    public static void main(String[] args) {
        // Create an object of Dog
        Dog myDog = new Dog();
        myDog.name = "Buddy";

        // Inherited method from Animal
        myDog.eat();

        // Method from Dog class
        myDog.bark();

        // myDog.weep();
    }
}