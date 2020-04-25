package fun.happyhacker.java.basics.inherit.abstractclass;

public class Student extends Person {
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    private String major;

    public Student(String name, String aMajor) {
        super(name);
        major = aMajor;
    }

    @Override
    public String getDescription() {
        return "I am a student major " + major;
    }
}
