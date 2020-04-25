package fun.happyhacker.java.basics.bad;

public class Employee {
    public Employee(double salary) {
        this.salary = salary;
    }

    private double salary;

    public static void main(String[] args) {

        Employee a = new Employee(100);
        Employee b = new Employee(200);

        System.out.println(a.getSalary());
        System.out.println(b.getSalary());
        swap(a, b);
        System.out.println(a.getSalary());
        System.out.println(b.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee employee = x;
        x = y;
        y = employee;
    }

    public double getSalary() {
        return salary;
    }
}
