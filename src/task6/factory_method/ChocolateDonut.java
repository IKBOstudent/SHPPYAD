package task6.factory_method;

public class ChocolateDonut implements Donut {
    @Override
    public void eat() {
        System.out.println("Eating chocolate donut");
    }

    @Override
    public String getFlavor() {
        return "chocolate";
    }
}
