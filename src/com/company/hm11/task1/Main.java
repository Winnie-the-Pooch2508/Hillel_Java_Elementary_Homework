package com.company.hm11.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
/*1. Создать метод countOccurance, принимающий на вход строковый список
в качестве параметра и произвольнуюстроку.
Список заполнен произвольными словами 10-20 штук, которые могут повторяться в неограниченном количестве.
 Посчитать сколько раз встречается переданная строка в качестве второго аргумента.*/

    public int countOccurrence(List<String> strings, String target) {
        int count = 0;
        for (String string : strings) {
            if (string.equals(target)) {
                count++;
            }
        }
        System.out.println("Count: " + count);

        return count;
    }
    /*2. Создать метод toList, принимающий на вход целочисленный массив произвольной длины.
    Конвертировать массив в список соответствующего типа данных и вернуть из метода.
     Например:
    Было Array [1, 2, 3]
    Стало List [1, 2, 3]*/

    public static List<Integer> toList(Integer[] arr) {
        return Arrays.asList(arr);
    }
/*3. Создать метод findUnique, принимающий на вход числовой список состоящий из произвольных значений,
    которые могут повторяться в неограниченном количестве. Необходимо вернуть новый числовой
    список содержащий только уникальные числа.*/

    public static List<Integer> findUnique(List<Integer> arr) {
        List<Integer> unique = new ArrayList<>();
        for (Integer integer : arr) {
            if (!unique.contains(integer)) {
                unique.add(integer);
            }
        }
        return unique;
    }








}
