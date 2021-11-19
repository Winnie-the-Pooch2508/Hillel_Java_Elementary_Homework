package com.company.hm1;

public class Second {
    /*№3 Написать метод который вернет String в которой будут в одну строку числа от 1 до 30.
    Каждое число при этом взять в круглые скобки ()*/
    public static String makeLineNumber() {
        StringBuilder stringLine = new StringBuilder();
        for (int i = 1; i < 31; i++) {
            stringLine.append("(").append(i).append(")");
        }
        return stringLine.toString();
    }

    /* №4 Написать метод который убирает лишние пробелы в строке и возвращает строку.*/
    public static String createString() {
        var result = new StringBuilder();
        for (int i = 1; i <= 30; i++) {
            result.append("(").append(i).append(")");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //4
        String x = "Hello     my      Friend's.    Today is        my          birthday! ";
        while (x.contains("  ")) {
            x = x.replace("  ", " ");
        }
        System.out.println(x);
    }

    /*№5 Задан 2-мерный массив char и слово. Написать метод который определит есть ли по вертикали или горизонтали это слово.
       Например, в данном случае для слова test метод должен вернуть true:
       Массив загрузить из текстового файла
     */
    public static int counter = 0;
    public static int countCol = 0;
    public static int countLine = 0;

    public static boolean checkArray(char[][] args, String strTest) {
        char[] stringToArray = strTest.toCharArray();
        countLine = args.length;
        countCol = args[0].length;
        for (int i = 0; i < countLine; i++) {
            for (int j = 0; j < countCol; j++) {
                if (args[i][j] == stringToArray[counter]) {
                    counter++;
                    if (counter == stringToArray.length) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        for (int i = 0; i < countCol; i++) {
            for (int j = 0; j < countLine; j++) {
                if (args[j][i] == stringToArray[counter]) {
                    counter++;
                    if (counter == stringToArray.length) {
                        return true;
                    }
                } else {
                    counter = 0;
                }
            }
        }
        return false;
    }
}
