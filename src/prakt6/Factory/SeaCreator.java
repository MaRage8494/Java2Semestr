package prakt6.Factory;

public class SeaCreator extends Factory{
    @Override
    protected Transport createTransport() {
        return new SeaTransport();
    }
}
