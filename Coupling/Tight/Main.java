package Coupling.Tight;

class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    Engine engine = new Engine(); // directly creates and depends on Engine

    void drive() {
        engine.start();  // tightly coupled to Engine
        System.out.println("Car is moving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}