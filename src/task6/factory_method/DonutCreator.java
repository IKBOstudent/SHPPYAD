package task6.factory_method;

public class DonutCreator {
    public Donut create(String flavor) {
        if (flavor == "cream")
            return new CreamDonut();
        else if (flavor == "chocolate")
            return new ChocolateDonut();
        else throw new IllegalArgumentException("no such flavor");
    }
}
