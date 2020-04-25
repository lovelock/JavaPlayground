package fun.happyhacker.java.basics.inherit;

public class Child extends Grand {
    @Override
    public String getName() {
        return "child: " + super.getName();
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.getName());
    }
}
