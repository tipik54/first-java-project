package ru.kaznu.ruslan.second.hw;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        numberOfPrints();
    }

    public static void numberOfPrints() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество печатаний в консоль");
        int input = scanner.nextInt();
        System.out.println("Введите что печатать");
        String string = scanner.nextLine();

        for (int i = 0; i < input; i++) {
            System.out.println(string);
        }
    }
}
