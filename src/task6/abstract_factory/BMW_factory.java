package task6.abstract_factory;

public class BMW_factory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new BMW_sedan();
    }

    @Override
    public Hatchback createHatchback() {
        return new BMW_hatchback();
    }
}
