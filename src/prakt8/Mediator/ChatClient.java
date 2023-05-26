package prakt8.Mediator;

public class ChatClient {

    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();
        Mediator mediator1 = new MediatorImpl();
        User user1 = new UserImpl(mediator, "Egor");
        User user2 = new UserImpl(mediator, "Yulia");
        User user3 = new UserImpl(mediator1, "Erica");
        User user4 = new UserImpl(mediator1, "Marat");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator1.addUser(user3);
        mediator1.addUser(user4);

        user1.send("Hi All");
        user3.send("What`s up?");

    }

}