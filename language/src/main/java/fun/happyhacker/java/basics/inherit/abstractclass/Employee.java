package fun.happyhacker.java.basics.inherit.abstractclass;

import java.time.LocalDate;

public class Employee extends Person {
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    @Override
    public String getDescription() {
        return "An employee";
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
}
