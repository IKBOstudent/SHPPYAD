package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;


/**
 * Реализовать:
 * <ol>
 * <li>Класс Human (int age, String firstName,
 *                  String lastName, LocalDate birthDate, int weight);</li>
 *
 * <li>Приложение, которое создает список из объектов класса Human, а
 * затем производит действия:</li>
 *  <ul>
 *      <li>Сортировка по второй букве имени</li>
 *      <li>Фильтрация по весу кратно 10</li>
 *      <li>Сортировка по произведению веса на возраст</li>
 *      <li>Произведение всех весов</li>
 *  </ul>
 * </ol>
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();

        humans.add(new Human(23, "Mark", "Terris", LocalDate.of(LocalDate.now().getYear() - 23, 8, 2), 97));
        humans.add(new Human(78, "Kris", "Marter", LocalDate.of(LocalDate.now().getYear() - 78, 1, 8), 88));
        humans.add(new Human(15, "Ivan", "Ivanov", LocalDate.of(LocalDate.now().getYear() - 15, 12, 5), 76));
        humans.add(new Human(25, "John", "Dutton", LocalDate.of(LocalDate.now().getYear() - 25, 11, 1), 50));

        System.out.println("Отсортированный 1:");
        humans.stream().sorted(Comparator.comparingInt(a -> a.firstName.charAt(1))).forEach(System.out::println);

        System.out.println("Отфильтрованный:");
        humans.stream().filter((a) -> a.weight % 10 == 0).forEach(System.out::println);

        System.out.println("Отсортированный 2:");
        humans.stream().sorted(Comparator.comparing(a -> a.weight * a.age)).forEach(System.out::println);

        System.out.println("Произведение всех весов");
        System.out.println(humans.stream().mapToInt(x -> x.weight).reduce(1, (mult, a) -> mult * a));

    }
}
