package task8.Memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public void checkState() {
        System.out.println("Current state is " + state);
    }

    public Memento saveState() {
        return new Memento(state);
    }

    public void restoreState(Memento memento) {
        this.state = memento.state();
    }
}