package fun.happyhacker.java.basics.inherit.abstractclass;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        Employee employee = new Employee("Happy Hacker", 2000000, 2020, 8, 12);
        Student student = new Student("Frost Wong", "bio");
        people[0] = employee;
        people[1] = student;

        for (Person person : people) {
            System.out.println("description: " + person.getDescription());
        }
    }
}
