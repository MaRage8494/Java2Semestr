package prakt6.AbstactFactory;

public class GermanCarFactory implements AbstractCarFactory{
    @Override
    public Car createCar() {
        return new GermanCar();
    }

    @Override
    public House createHouse(){
        return new GermanHouse();
    }
}
