package task6;

import task6.abstract_factory.*;
import task6.builder.*;
import task6.factory_method.*;
import task6.prototype.Student;


import java.util.Dictionary;

public class Main {
    public static void main(String[] args) {
        // factory method pattern
        Donut cream = new DonutCreator().create("cream");
        Donut chocolate = new DonutCreator().create("chocolate");

        cream.eat();
        chocolate.eat();

        // abstract factory pattern
        CarFactory bmw_factory = new BMW_factory();
        CarFactory vw_factory = new VW_factory();

        Client bmw_client = new Client(bmw_factory);
        bmw_client.driveCars();
        Client vw_client = new Client(vw_factory);
        vw_client.driveCars();

        // builder pattern
        CarBuilder bmw_builder = new BMW_builder();
        Director director = new Director(bmw_builder);
        Car bmw_car = director.buildCar();
        System.out.println(bmw_car);

        // prototype pattern
        Student s1 = new Student("Misha");
        System.out.println(s1);

        Student s2 = (Student) s1.copy();
        System.out.println(s2);
        System.out.println(s1.hashCode() + " " + s2.hashCode());

    }
}
