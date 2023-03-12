package task7.decorator;

public class Decorator implements Component {
    protected Component component;

    public Decorator (Component c) {
        this.component = c;
    }

    @Override
    public void mainOperation() {
        component.mainOperation();
    }

    public void secondOperation() {
        System.out.println("Executing decorator's operation");
    }
}
