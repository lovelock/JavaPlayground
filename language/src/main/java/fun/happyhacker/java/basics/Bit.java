package fun.happyhacker.java.basics;

public class Bit {
    public static void main(String[] args) {
        int a = (int)Math.pow(2.0, 31) - 1;
        System.out.println(a);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);
    }
}
