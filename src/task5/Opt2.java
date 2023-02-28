package task5;

public class Opt2 {
    private static Opt2 instance = null;

    public static synchronized Opt2 getInstance() {
        if (instance == null) {
            instance = new Opt2();
        }
        return instance;
    }
}
