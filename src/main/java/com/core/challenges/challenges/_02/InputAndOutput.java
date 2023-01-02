package com.core.challenges.challenges._02;

import java.util.Scanner;

public class InputAndOutput {

    public void review() {
        System.out.println("Hello world"); // Agrega un enter al final
        System.out.print("Hello world"); // No agrega un enter al final
        System.out.printf("Hello %s", "Nico"); // Agrega un parámetro a la String

        Scanner scanner = new Scanner(System.in); // Creo el scanner
        String name = scanner.next(); // Pido una string
        int age = scanner.nextInt(); // Pido un número
        System.out.printf("Hello %s. I'm %d years old.", name, age);
    }

    public void getUsersAge() {
        System.out.println("Age: ");
        Scanner scanner = new Scanner(System.in);
        try {
            byte age = scanner.nextByte();
            System.out.println("Tu edad es: " + age);
        } catch (Exception e) {
            System.out.println("La edad es invalida");
        }
    }

    public void getUsersName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String lastName = scanner.next();
        System.out.println(name + "." + lastName + "@gmail.com");
    }

    public void printBinaryForm(int n) {
        while(n != 0) {
            System.out.print(n % 2);
            n = n / 2;
        }
    }

    public void printTables() {
        int i = 0;
        while(i <= 10) {
            System.out.printf("3 x %d = %d\n", i, 3 * i);
            i = i + 1;
        }
    }
}
