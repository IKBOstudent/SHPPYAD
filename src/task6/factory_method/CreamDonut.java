package task6.factory_method;

public class CreamDonut implements Donut {
    @Override
    public void eat() {
        System.out.println("Eating cream donut");
    }

    @Override
    public String getFlavor() {
        return "cream";
    }
}
