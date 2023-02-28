package task6.builder;

public class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar() {
        return builder.buildEngine().buildDriveTrain().buildCar();
    }
}
