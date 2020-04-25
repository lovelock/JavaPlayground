package fun.happyhacker.java.multithread;

public class VolatileExample {

    private static boolean ready;
    private static int number;

    public static void main(String[] args) {
        new Thread(() -> {
            while (!ready) {
                Thread.yield();
            }

            System.out.println(number);

        }).start();

        ready = true;
        number = 42;
    }
}
