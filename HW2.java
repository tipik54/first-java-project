package ru.kaznu.ruslan.second.hw;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        //Реализуйте метод, принимающий в качестве аргументов
        //целое число и строку, и печатающий в консоль строку указанное количество раз
        int[] array = arrayData();
        output(array);



    }

    public static int[] arrayData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество печатаний в консоль: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        System.out.println("Введите что печатать: ");
        int arrayData = scanner.nextInt();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = arrayData;
        }
        return array;
    }

    public static void output(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            }
        }
}
