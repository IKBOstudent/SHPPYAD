package task6.abstract_factory;

public class Client {
    private final Sedan sedan;
    private final Hatchback hatchback;

    public Client(CarFactory factory) {
        sedan = factory.createSedan();
        hatchback = factory.createHatchback();
    }

    public void driveCars() {
        sedan.drive();
        hatchback.drive();
    }

}
