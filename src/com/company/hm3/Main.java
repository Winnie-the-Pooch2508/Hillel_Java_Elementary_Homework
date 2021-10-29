package com.company.hm3;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person("Degtjarenko Artem Vitaliovich");
        System.out.println(person1);

        int[] arrayUnsorted = new int[5];
        fillAnArray(arrayUnsorted);

        int[] squaredArray = squaredArray(arrayUnsorted);
        System.out.println();
        sortAnArray(squaredArray);
        for (int j : arrayUnsorted) {
            System.out.println(j);
        }

        System.out.println();

        String stringToRearrange = "abc";
        System.out.println("Given string: " + stringToRearrange);
        Set<String> changed = generatePerm(stringToRearrange);
        System.out.println(changed);
        System.out.println();

        String given = "acb";
        System.out.println("String 1: " + given);
        String toBeMatched = "cba";
        System.out.println("String 2: " + toBeMatched);
        boolean result = matchingStrings(given, toBeMatched);
        System.out.println(result);
    }

    public static void fillAnArray(int[] emptyArray) {
        for (int i = 0; i < emptyArray.length; i++) {
            emptyArray[i] = (int) Math.round((Math.random() * 31) - 15);
        }
        System.out.println("Random numbers = " + Arrays.toString(emptyArray));
    }

    public static void sortAnArray(int[] arrayToSort) {

        int temp = 0;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = 0; j < arrayToSort.length - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }

    }

    public static int[] squaredArray(int[] arrayToSquare) {
        for (int i = 0; i < arrayToSquare.length; i++) {
            arrayToSquare[i] = arrayToSquare[i] * arrayToSquare[i];
        }
        return arrayToSquare;
    }

    private static boolean matchingStrings(String given, String toFindMatch) {

        Set<String> rearranged = generatePerm(given);
        String[] arrayOfStrings = setToArray(rearranged);

        for (String arrayOfString : arrayOfStrings) {
            if (arrayOfString.equals(toFindMatch)) {
                return true;
            }
        }
        return false;
    }

    public static Set<String> generatePerm(String input) {
        Set<String> set = new HashSet<>();
        if (Objects.equals(input, ""))
            return set;

        Character a = input.charAt(0);

        if (input.length() > 1) {
            input = input.substring(1);

            Set<String> permSet = generatePerm(input);

            for (String x : permSet) {
                for (int i = 0; i <= x.length(); i++) {
                    set.add(x.substring(0, i) + a + x.substring(i));
                }
            }
        } else {
            set.add(a + "");
        }
        return set;
    }

    public static String[] setToArray(Set<String> setOfString) {
        return setOfString.toArray(new String[0]);
    }

}