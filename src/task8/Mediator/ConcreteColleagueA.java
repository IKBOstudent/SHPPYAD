package task8.Mediator;

public class ConcreteColleagueA implements Colleague {
    private final Mediator mediator;

    public ConcreteColleagueA(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println("ColleagueA received message: " + message);
    }
}
