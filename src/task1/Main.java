package task1;

import java.util.function.BiFunction;

/**
 * Имплементировать интерфейс Function, получающий на вход пару
 * чисел и возвращающий наибольший общий делитель.
 */
public class Main {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> GCD = new BiFunction<>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                if (b == 0) return a;
                else return apply(b, a % b);
            }
        };

        System.out.println(GCD.apply(42, 56) == 14);
        System.out.println(GCD.apply(461952, 116298) == 18);
        System.out.println(GCD.apply(7966496, 314080416) == 32);
        System.out.println(GCD.apply(24826148, 45296490) == 526);
        System.out.println(GCD.apply(12, 0) == 12);
        System.out.println(GCD.apply(0, 0) == 0);
        System.out.println(GCD.apply(0, 9) == 9);
    }
}