package by.tsvirko.tasks.lesson3.task1;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void arrayEven() {

        System.out.println("Массив из четных чисел от 2 до 20. ");

        int[] array = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int a : array) {
            System.out.println(a);

        }
    }

    public static void arrayOdd() {

        System.out.println("Массив из неечтных чисел от 1 - 99");

        int a = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0)
                a++;
        }

        int[] array = new int[a];
        for (int i = 1, b = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void arrayFromRandomNumb() {
        System.out.println("Мфссив из 15 случайных чисел из отрезка [0;99]");

        int count = 0;
        int[] array = new int[15];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("В массиве " + count + " четных элементов.");
    }

    public static void oddIndexNull() {
        System.out.println("Массив из 20 случайных чисел из отрезка [0;20]");


        int[] array = new int[20];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(21);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }


    public static void twoArray() {
        System.out.println("Создать два массива из 5 случайных целых чисел.");

        int sumArrayFirst = 0;
        int[] arrayFirst = new int[5];
        Random r = new Random();
        for (int i = 0; i < arrayFirst.length; i++) {
            arrayFirst[i] = r.nextInt(16);
            System.out.print(arrayFirst[i] + " ");
            sumArrayFirst += arrayFirst[i] / arrayFirst.length;
        }

        System.out.println();
        int[] arraySecond = new int[5];
        int sumArraySecond = 0;
        for (int i = 0; i < arraySecond.length; i++) {
            arraySecond[i] = r.nextInt(16);
            System.out.print(arraySecond[i] + " ");
            sumArraySecond += arraySecond[i] / arraySecond.length;
        }

        System.out.println();
        if (sumArrayFirst == sumArraySecond) {
            System.out.println("Среднее арифметическое массивов равны.");
        } else if (sumArrayFirst > sumArraySecond) {
            System.out.println("Среднее арифметическое первого массива больше");
        } else {
            System.out.println("Среднее арифметическое второ массива больше.");
        }
    }

    public static void arrayUp() {
        System.out.println("Проверить, является ли массив в строго возрастающей последовательности.");
//Задача "выбрасывает" ошибку.
        int[] array = new int[4];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(11);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean flag = true;
        for (int i = 0; i < 11; i++) {
            if (array[i] <= array[1]) {
                break;
            }
            flag = false;
            if (flag) {
                System.out.println("Массив не в возрастающей последовательности");
            } else {
                System.out.println("Массив в возрастающей последовательности");
            }
        }

    }

    public static void maxElement() {
        System.out.println("Определить какой элемент в массиве является максимальным");

        int[] array = new int[12];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(16);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < 12; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент это : " + max);
    }

    public static void threeArrays() {
        System.out.println("Три массива...");
    }

    public static void enterNumb() {
        System.out.println("Пользователь вводит положительное число.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число : ");
        //Число ,почему-то, надо вводить два раза...
        scanner.hasNextInt();
        int a = scanner.nextInt();
        if (scanner.hasNextInt()) {
            if (a % 2 != 0 || a < 1)
                System.out.println();
        } else {
            System.out.println("Вы ввели не число");
        }
        scanner.close();
        int[] array = new int[a];
        Random r = new Random();
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(16);
            System.out.print(array[i] + " ");
            if (i <= array.length / 2 - 1) {
                sumLeft += Math.abs(array[i]);
            } else {
                sumRight += Math.abs(array[i]);
            }
            if (i == array.length - 1) {
                System.out.println("");
                if (sumLeft > sumRight) {
                    System.out.println("Сумма модулей левой половины больше и равны : " + sumLeft);
                } else if (sumRight > sumLeft) {
                    System.out.println("Сумма модулей правой половины массива больше и равна : " + sumRight);
                } else if (sumLeft == sumRight) {
                    System.out.println("Сумма левой и рпавой стороны модуля равны.");
                }
            }
        }
    }

    public static void enterNumbMoreTree() {// разобраться...
        System.out.println("Создание второго массива только из четных чисел");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше 3 : ");
        scanner.hasNextInt();
        int n = scanner.nextInt();
        while (n <= 3) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 3) {
                    System.out.println("Введенное число должно быть больше 3. Повторите ввод:");

                } else {
                    System.out.println("Вы ввели не число. Повторите ввод:");
                    scanner.next();
                }

                int[] array = new int[n];
                int evenNums = 0;
                Random r = new Random();
                for (int i = 0; i < array.length; i++) {
                    array[i] = r.nextInt(n);
                    System.out.print(array[i] + " ");
                    if (array[i] % 2 == 0) {
                        evenNums++;
                    }
                }
                int[] array2 = new int[evenNums];
                int index = 0;
                for (int i = 0; i < n; i++) {
                    if (array[i] % 2 == 0) {
                        array2[index] = array[i];
                        index++;
                    }
                    System.out.println(array2);
                }
            }
        }
    }

    // Дополнительные задачи.

    public static void sumElem() {
        System.out.println("Найти произведение элементов кратное 3");

        int array[] = {2, 3, 7, 5, 9, 15, 65, 32, 33, 30, 13, 73, 3, 5, 17};
        int a = 1;
        for (int i = 0; i < 15; i++) {
            if (array[i] % 3 == 0) {
                a *= array[i];
                System.out.println(a);
            }
        }
    }


    public static void oddMidlElem() {
        System.out.println("Найти среднее арифметическое элементов с нечетными номерами");

        int[] array = {1, 3, 5, 8, 6};
        int oddNum = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddNum++;
            }
        }
        System.out.println();
        int[] array2 = new int[oddNum];
        int index = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array[i] % 2 != 0) {
                array2[index] = array[i];
                index++;
                sum += array2[i] / array2.length;
                System.out.println(sum);
            }
        }
    }
}
