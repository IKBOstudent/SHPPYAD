package task6.abstract_factory;

public class VW_factory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new VW_sedan();
    }

    @Override
    public Hatchback createHatchback() {
        return new VW_hatchback();
    }
}
