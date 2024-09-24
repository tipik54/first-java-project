package ru.kaznu.ruslan.second.hw;

import java.util.Arrays;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
// Реализуйте метод, принимающий в качестве аргументов
// целое число и ссылку на целочисленный массив,
// увеличивающий каждый элемент которого на указанное число.
        int[] array = arrayData();
        increaseByNumber(array);

    }

    public static int[] arrayData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Массив следующей длины: " + arrayLength);
        int[] array = new int[arrayLength];
        System.out.println("и имеет вид " + Arrays.toString(array));

        System.out.println("Введите данные массива: ");
        for (int i = 0; i < arrayLength; i++) {
            int arrayData = scanner.nextInt();
            array[i] = arrayData;
            System.out.println("Массив имеет вид " + Arrays.toString(array));
        }
        System.out.println("Массив заполнен и имеет следующий вид " + Arrays.toString(array));
        return array;
    }

    public static void increaseByNumber (int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько увеличить данные массива?");
        int increase = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] += increase;
        }
        System.out.println("Вышло: " + Arrays.toString(array));
    }
}
