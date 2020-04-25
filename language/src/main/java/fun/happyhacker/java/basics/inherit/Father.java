package fun.happyhacker.java.basics.inherit;

public class Father extends Grand {
    @Override
    public String getName() {
        return "father " + super.getName();
    }
}
