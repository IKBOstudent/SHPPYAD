package task4;

public class Main {
    public static void main(String[] args) {
        MyExecutorService executorService = new MyExecutorService(2);
        executorService.execute(() -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            System.out.println("working 1");
        });

        executorService.execute(() -> {
            try {
                Thread.sleep(11);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("working 2");
        });

        executorService.execute(() -> System.out.println("working 3"));
        executorService.shutdown();
    }
}
