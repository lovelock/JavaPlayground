package fun.happyhacker.java.basics.inherit.abstractclass;

abstract public class Person {
    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    private String name;
}
