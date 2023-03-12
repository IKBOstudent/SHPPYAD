package task8;

import task8.Mediator.ConcreteColleagueA;
import task8.Mediator.ConcreteColleagueB;
import task8.Mediator.ConcreteMediator;
import task8.Memento.Caretaker;
import task8.Memento.Originator;

public class Main {
    public static void main(String[] args) {

        ConcreteMediator m = new ConcreteMediator();
        ConcreteColleagueA clA = new ConcreteColleagueA(m);
        ConcreteColleagueB clB = new ConcreteColleagueB(m);
        m.SetColleagueA(clA);
        m.SetColleagueB(clB);

        clA.send("hello from colleague A");
        clB.send("hello from colleague B");


        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("initial state");
        originator.checkState();

        // creating memento and save current state
        caretaker.setMemento(originator.saveState());

        originator.setState("new state");
        originator.checkState();

        originator.restoreState(caretaker.getMemento());
        originator.checkState();



    }
}
