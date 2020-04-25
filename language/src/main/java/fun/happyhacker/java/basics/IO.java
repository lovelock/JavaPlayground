package fun.happyhacker.java.basics;

import java.io.Console;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        IO io = new IO();
        io.console();
    }

    private void scanner() {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.println("How old are you?");
        int age = in.nextInt();

        System.out.println("Hello " + name + ", you'll be " + (age + 1) + " next year!");
    }

    private void console() {
        Console console = System.console();
        String username = console.readLine("User name: ");
        char[] password = console.readPassword("Password: ");
        System.out.println(username);
        System.out.println(password);
    }
}

