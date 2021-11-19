package com.company.hm1;

import java.util.Random;

public class First {
    public static int[] randomArr = new int[10];
    public static int average = 0;
    public static double result;

    public static void main(String[] args) {
        /*
        №1 Вывести ряд чисел от 1 до 100 через пробел, с изменениями:
        - если число кратно 3 то вместо него вывести Hello
        - если число кратно 5 то вместо него вывести World
        - если число кратно и 3 и 5 то вместо него вывести HelloWorld
        */
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("HelloWorld ");
            } else if (i % 5 == 0) {
                System.out.print("World ");
            } else if (i % 3 == 0) {
                System.out.print("Hello ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
    /*№2 Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно).
    Вывести среднее арифметическое.*/
    public static double randomizeArray() {
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int randNum = random.nextInt(10 + 1) + 10;
            randomArr[i] = randNum;
            average += randNum;
        }
        result = average / 10.0;
        return result;
    }
}