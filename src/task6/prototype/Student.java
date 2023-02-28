package task6.prototype;

public class Student implements Copyable{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Copyable copy() {
        return new Student(this.name);
    }
}
