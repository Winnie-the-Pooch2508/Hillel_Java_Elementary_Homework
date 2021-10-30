package com.company.hm5;
/*
Задана строка английских слов через пробел.
Написать метод который который вернет эту же строку но в которой слова в обратном порядке.
Например:
"man has dog" => "dog has man".
*/
public class Second {
    public static void main(String[] args) {
        String a = "man has dog ";
        System.out.println(a);
        reverseString(a);
        System.out.println(reverseString(a));
    }

    public static String reverseString(String letters) {
        String[] stringarray;
        String delimiter = " ";
        stringarray = letters.split(delimiter);
        StringBuilder lettersBuilder = new StringBuilder();
        for (int i = (stringarray.length-1); i>=0; i--){
            lettersBuilder.append(stringarray[i]).append(" ");
        }
        letters = lettersBuilder.toString();
        return letters;
    }
}



