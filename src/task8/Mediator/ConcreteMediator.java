package task8.Mediator;

public class ConcreteMediator implements Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    public void SetColleagueA(ConcreteColleagueA colleague) {
        this.colleagueA = colleague;
    }

    public void SetColleagueB(ConcreteColleagueB colleague) {
        this.colleagueB = colleague;
    }

    @Override
    public void send(String message, Colleague from) {
        if (from == colleagueA) {
            colleagueB.receive(message);
        } else {
            colleagueA.receive(message);
        }
    }
}
