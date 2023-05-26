package prakt6.AbstactFactory;

public class Test {
    public static void main(String[] args) {
        AbstractCarFactory factory = new RussianCarFactory();
        Car car = factory.createCar();
        car.info();
        factory = new GermanCarFactory();
        Car car2 = factory.createCar();
        car2.info();
    }
}
