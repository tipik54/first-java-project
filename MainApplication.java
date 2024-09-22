package ru.kaznu.ruslan.first.project;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //сканер для ввода пользователем значений

        while (true) {                      //Запуск цикла для проверки каждого задания не запуская программу с нуля
            System.out.println("Выберите операцию:");
            System.out.println("1: greetings");
            System.out.println("2: checkSign");
            System.out.println("3: selectColor");
            System.out.println("4: compareNumbers");
            System.out.println("5: addOrSubtractAndPrint");
            System.out.println("0: Выход из программы");

            int choice = scanner.nextInt(); // переменная для ввода числа, от которого будет выбран метод выбора
            int input = 0; // начальное значение выбора способа ввода

            switch (choice) {
                case 1:
                    greetings(); //Вызов первого задания
                    break;
                case 2:
                    System.out.println("Выберите способ ввода: 0 - ручной ввод; 1 - случайные числа");
                    input = scanner.nextInt();
                    if (input == 0) {
                        System.out.println("Введите 3 числа");
                        int a = scanner.nextInt();
                        int b = scanner.nextInt();
                        int c = scanner.nextInt();
                        checkSign(a, b, c);//Вызов второго задания
                    } else {
                        int a = (int) (Math.random() * 100); //Метод Math.random() возвращает число от 0 до 1 типа double, поэтому необходимо его переделать в int (если конечно нужны целые числа) и до множить на 100, чтобы расширить предел до от 0 до 99
                        int b = (int) (Math.random() * 100);
                        int c = (int) (Math.random() * 100);
                        System.out.println("Получены следующие случайные числа: " + a + " + " + b + " + " + c);
                        checkSign(a, b, c);
                    }

                    break;
                case 3:
                    System.out.println("Выберите способ ввода: 0 - ручной ввод; 1 - случайные числа");
                    input = scanner.nextInt();
                    if (input == 0) {
                        System.out.println("Введите число");
                        int data = scanner.nextInt();
                        selectColor(data);//Вызов третьего задания
                    } else {
                        int data = (int) (Math.random() * 100);
                        System.out.println("Получено следующее случайное число: " + data);
                        selectColor(data);
                    }
                    break;
                case 4:
                    System.out.println("Выберите способ ввода: 0 - ручной ввод; 1 - случайные числа");
                    input = scanner.nextInt();
                    if (input == 0) {
                        System.out.println("Введите 2 числа");
                        int n1 = scanner.nextInt();
                        int n2 = scanner.nextInt();
                        compareNumbers(n1, n2);//Вызов четвертого задания
                    } else {
                        int n1 = (int) (Math.random() * 100);
                        int n2 = (int) (Math.random() * 100);
                        System.out.println("Получены следующие случайные числа: " + n1 + " + " + n2);
                        compareNumbers(n1, n2);
                    }
                    break;
                case 5:
                    System.out.println("Выберите способ ввода: 0 - ручной ввод; 1 - случайные числа");
                    input = scanner.nextInt();
                    if (input == 0) {
                        System.out.println("введите 2 числа");
                        int initValue = scanner.nextInt();
                        int delta = scanner.nextInt();

                        System.out.println("Введите true если прибавить, введите false если вычесть");
                        boolean increment = scanner.nextBoolean();
                        addOrSubstractAndPrint(initValue, delta, increment);//Вызов пятого задания
                    } else {
                        int initValue = (int) (Math.random() * 100);
                        int delta = (int) (Math.random() * 100);

                        System.out.println("Введите true если прибавить, введите false если вычесть");
                        boolean increment = scanner.nextBoolean();
                        addOrSubstractAndPrint(initValue, delta, increment);
                    }
                    break;
                case 0:
                    System.out.println("Завершение программы");
                    return;//Конец программы
            }
        }
    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {

        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void selectColor(int data) {

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int n1, int n2) {
        if (n1 >= n2) {
            System.out.println(n1 + " >= " + n2);
        } else {
            System.out.println(n1 + " < " + n2);
        }
    }

    public static void addOrSubstractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + " + " + delta + " = " + (initValue + delta));
        } else {
            System.out.println(initValue + " - " + delta + " = " + (initValue - delta));
        }
    }
}