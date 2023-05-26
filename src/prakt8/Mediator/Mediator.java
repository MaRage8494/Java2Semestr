package prakt8.Mediator;

public interface Mediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
