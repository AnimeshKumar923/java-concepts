package singleton;

public class Singleton {
    private Singleton () {
        System.out.println("Only one instance is created in singleton class");
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
