package task6.builder;

public interface CarBuilder {
    public CarBuilder buildEngine();
    public CarBuilder buildDriveTrain();

    public Car buildCar();
}
