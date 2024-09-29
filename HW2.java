package ru.kaznu.ruslan.second.hw;

public class HW2 {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 3, 5};
        isBalancedPoint(array1);

    }

    public static void isBalancedPoint(int[] array) {
        int totalSum = 0; // Начальное значение суммы массива

        // Считаем общую сумму массива
        for (int i = 0; i < array.length; i++) {
            totalSum += array[i];
        }

        int leftSum = 0; // Сумма левой части массива, чтобы сравнивать ее потом с правой для нахождения сбалансированной точки
        boolean balancedPointFound = false; // начальное значение нахождения сбалансированной точки, для дальнейшего прекращения цикла, при ее нахождении

        // Раскрываем массив и ищем сбалансированную точку
        for (int i = 0; i < array.length; i++) {
            // Для нахождения сбалансированной точки будем сравнивать левую с правой части
            // для этого мы представляем правую часть как выражение указанное в условии
            // и проводим это сравнение до тех пор пока левая часть не станет равной правой
            if (leftSum == (totalSum - leftSum - array[i])) {
                System.out.println("Сбалансированная точка найдена на индексе: " + i);
                System.out.println("Левая сумма: " + leftSum + ", Правая сумма: " + (totalSum - leftSum - array[i]));
                balancedPointFound = true; // Указываем что мы нашли сбалансированную точку
                break; // Прекращаем цикл, если нашли точку
            }
            // Если сбалансированная точка не найдена то к переменной leftSum прибавится значение элемента массива и далее
            // снова произведет проверку массива на сбалансированную точку по условию
            leftSum += array[i];
        }

        // Проверка на сбалансированную точку между элементами
        if (!balancedPointFound) {
            leftSum = 0; // Сброс левой суммы для проверки между элементами
            for (int i = 0; i < array.length - 1; i++) {
                leftSum += array[i];
                int rightSum = totalSum - leftSum;

                if (leftSum == rightSum) {
                    System.out.println("Сбалансированная точка найдена между индексами: " + i + " и " + (i + 1));
                    System.out.println("Левая сумма: " + leftSum + ", Правая сумма: " + rightSum);
                    balancedPointFound = true;
                    break; // Прекращаем цикл, если нашли точку
                }
            }
        }

        if (!balancedPointFound) {
            System.out.println("Сбалансированная точка не найдена.");
        }
    }
}




