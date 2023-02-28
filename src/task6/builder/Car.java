package task6.builder;

public class Car {
    private String engine;
    private String driveTrain;

    public Car(String engine, String driveTrain) {
        this.engine = engine;
        this.driveTrain = driveTrain;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", driveTrain='" + driveTrain + '\'' +
                '}';
    }
}
