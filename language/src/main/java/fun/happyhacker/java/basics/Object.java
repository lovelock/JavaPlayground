package fun.happyhacker.java.basics;

import java.time.LocalDate;

public class Object {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        LocalDate aThousandYearsLater = date.plusYears(1000);

        year = aThousandYearsLater.getYear();
        System.out.println(year);
    }


    private void hello() {
        System.out.println("Google d and kkdjdkf        ");
    }
}
