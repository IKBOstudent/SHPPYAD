package task7.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component c) {
        super(c);
    }

    @Override
    public void secondOperation() {
        System.out.println("Executing special operation");
    }
}
