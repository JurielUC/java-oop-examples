package ChapterOne.BuildingBlocks;

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand+ " is driving at " +speed+ " km/h");
    }

    void honk() {
        System.out.println(brand+ " says: Beep Beep!");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 80;

        myCar.drive();
        myCar.honk();
    }
}