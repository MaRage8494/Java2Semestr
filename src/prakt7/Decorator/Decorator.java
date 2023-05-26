package prakt7.Decorator;

public class Decorator implements Service {
    private Service service;
    private String label;
    private double price;

    public Decorator(Service service, String label, double price) {
        System.out.println(label + " " + price);
        this.service = service;
        this.label = label;
        this.price = price;
    }

    public double getPrice() {
        return this.price + service.getPrice();
    }

    public String getLabel() {
        return this.label + service.getLabel();
    }
}
