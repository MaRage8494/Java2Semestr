package prakt6.Factory;

public abstract class Factory {
    public Transport doTransport(){
        Transport transport = createTransport();
        transport.deliver();
        return transport;
    }
    protected abstract Transport createTransport();
}
