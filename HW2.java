package ru.kaznu.ruslan.second.hw;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество печатаний в консоль");
        int input = scanner.nextInt();
        numberOfPrints(input);
    }

    public static void numberOfPrints(int input) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите что печатать"); // вписан в метод по причине того, что если оставить его в main сканнер пропустит строку
        String string = scanner.nextLine();
        for (int i = 0; i < input; i++) { // прописывает данные string до тех пор пока i не станет равен input
            System.out.println(string);
        }
    }
}
