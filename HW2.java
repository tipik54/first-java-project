package ru.kaznu.ruslan.second.hw;

import java.util.Arrays;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        //Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
        // суммирующий все элементы, значение которых больше 5, и
        // печатающий полученную сумму в консоль.
        int[] array = arrayData();
        arraySumElements(array);


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



    public static void arraySumElements(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value > 5) {
                sum += value;
            }
        }
        System.out.println("Сумма элементов массив: " + sum);
    }

}

