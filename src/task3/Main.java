package task3;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Реализовать:
 * Свою потокобезопасную имплементацию интерфейсов:
 * <ul>
 *  <li>Set с использованием ключевого слова synchronized</li>
 *  <li>Map с использованием Lock</li>
 * </ul>
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("t3");
        SynchronizedSet<Integer> threadSafeSet = new SynchronizedSet<>();
        LockedMap<Integer, String> threadSafeMap = new LockedMap<>();

        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, String> map = new HashMap<>();

        new Thread(() -> {
            for (int i = 0; i <= 1000000; i++){
                set.add(i);
                threadSafeSet.add(i);
                map.put(i, "a");
                threadSafeMap.put(i, "a");
            }
        }).start();

        for (int i = 1000000; i < 2000000; i++){
            set.add(i);
            threadSafeSet.add(i);
            map.put(i, "a");
            threadSafeMap.put(i, "a");
        }

        Thread.sleep(1000);

        System.out.println(set.size());
        System.out.println(threadSafeSet.size());
        System.out.println(map.size());
        System.out.println(threadSafeMap.size());
    }
}
