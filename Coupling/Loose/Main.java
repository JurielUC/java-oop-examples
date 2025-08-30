package Coupling.Loose;

interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Petrol Engine started.");
    }
}

class DieselEngine implements Engine {
    public void start() {
        System.out.println("Diesel Engine started.");
    }
}

class Car {
    private Engine engine;

    // Dependency Injection (engine is passed in)
    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();  // doesn't care which engine
        System.out.println("Car is moving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new PetrolEngine());
        car1.drive();

        Car car2 = new Car(new DieselEngine());
        car2.drive();
    }
}
