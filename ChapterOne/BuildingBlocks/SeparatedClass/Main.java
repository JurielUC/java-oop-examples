package ChapterOne.BuildingBlocks.SeparatedClass;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Mazda";
        myCar.speed = 80;

        myCar.drive();
        myCar.honk();
    }
}
