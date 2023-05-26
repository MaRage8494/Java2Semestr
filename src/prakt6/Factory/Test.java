package prakt6.Factory;

public class Test {
    public static void main(String[] args) {
        Factory roadTransport = new RoadCreator();
        roadTransport.doTransport();

        Factory seaTransport = new SeaCreator();
        seaTransport.doTransport();

    }
}
