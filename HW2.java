package ru.kaznu.ruslan.second.hw;

import java.util.Arrays;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
// Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
// и печатающий в консоль сумма элементов какой из половин массива больше.
        int[] array = arrayData();
        compareHalfs(array);
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

    public static void compareHalfs(int[] array) {
        int sum1Half = 0; //создание переменной для отслеживания суммы половин
        int sum2Half = 0;
        int arrayHalf = array.length / 2;
        for (int i = 0; i < (arrayHalf); i++) { // счет суммы первой половины массива
            sum1Half += array[i];
        }
        for (int i = arrayHalf; i < array.length; i++) { // счет суммы второй половины массива
            sum2Half += array[i];
        }
        if (sum1Half > sum2Half) {
            System.out.println("Первая половина больше второй: " + sum1Half + " > " + sum2Half);
        } else if (sum1Half < sum2Half) {
            System.out.println("Вторая половина больше первой: " + sum1Half + " > " + sum2Half);
        } else {
            System.out.println("Первая половина равна второй: " + sum1Half + " = " + sum2Half);
        }
    }
}
