package task7;

import task7.decorator.ConcreteComponent;
import task7.decorator.ConcreteDecoratorA;
import task7.decorator.Decorator;
import task7.facade.Computer;

public class Main {
    public static void main(String[] args) {
        Computer pc = new Computer();
        pc.start();

        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA dA = new ConcreteDecoratorA(c);
        dA.mainOperation();
        dA.secondOperation();
    }
}
