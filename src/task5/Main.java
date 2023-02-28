package task5;

import java.util.ArrayList;

class SimpleClass {}

public class Main {
    public static void main(String[] args) {
        Opt1 inst1 = Opt1.getInstance();
        Opt1 inst1_copy = Opt1.getInstance();
        System.out.println(inst1.hashCode() + " " + inst1_copy.hashCode());

        Opt2 inst2 = Opt2.getInstance();
        Opt2 inst2_copy = Opt2.getInstance();
        System.out.println(inst2.hashCode() + " " + inst2_copy.hashCode());

        Opt3 inst3 = Opt3.getInstance();
        Opt3 inst3_copy = Opt3.getInstance();
        System.out.println(inst3.hashCode() + " " + inst3_copy.hashCode());

        SimpleClass obj = new SimpleClass();
        SimpleClass obj_copy = new SimpleClass();
        System.out.println(obj.hashCode() + " " + obj_copy.hashCode());

    }
}
