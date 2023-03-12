package task8.Mediator;

public class ConcreteColleagueB implements Colleague {
    private final Mediator mediator;

    public ConcreteColleagueB(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("ColleagueB received message: " + message);
    }
}
