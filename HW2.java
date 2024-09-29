package ru.kaznu.ruslan.second.hw;

import java.util.Arrays;

public class HW2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};
        int[] array3 = {7, 8, 9, 10, 11};
        sumArrays(array1, array2, array3);

    }

    public static void sumArrays(int[]... arrays) {
        // Определяем максимальную длину среди всех массивов, так как итоговый массив должен быть длиной равной самому длинному
        int maxLength = 0;
        for (int[] array : arrays) {
            if (array.length > maxLength) {
                maxLength = array.length;
            }
        }

        // После проверки предыдущим циклом создаем массив с длинной равной maxlength
        int[] result = new int[maxLength];

        // В первом цикле выбирается массив, который во втором цикле раскрывается и каждый его элемент прибавляется к элементам под тем же номером
        // в массив result
        for (int i = 0; i < arrays.length; i++) {
            int[] currentArray = arrays[i];
            for (int j = 0; j < currentArray.length; j++) {
                result[j] += currentArray[j];
            }
        }
        System.out.println("Суммированный массив: " + Arrays.toString(result));

    }
}

