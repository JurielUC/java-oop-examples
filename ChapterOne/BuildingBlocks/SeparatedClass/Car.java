package ChapterOne.BuildingBlocks.SeparatedClass;

public class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand+ " is driving at " +speed+ " km/h");
    }

    void honk() {
        System.out.println(brand+ " says: Beep Beep!");
    }
}
