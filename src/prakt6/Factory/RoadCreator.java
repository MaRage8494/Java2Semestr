package prakt6.Factory;
public class RoadCreator extends Factory {
    @Override
    protected Transport createTransport() {
        return new RoadTransport();
    }
}
