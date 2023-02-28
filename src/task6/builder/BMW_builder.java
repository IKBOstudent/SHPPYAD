package task6.builder;

public class BMW_builder implements CarBuilder {
    public String engine;
    public String driveTrain;

    @Override
    public CarBuilder buildEngine() {
        this.engine = "V8/3L";
        return this;
    }

    @Override
    public CarBuilder buildDriveTrain() {
        this.driveTrain = "automatic";
        return this;
    }

    @Override
    public Car buildCar() {
        return new Car(this.engine, this.driveTrain);
    }
}
