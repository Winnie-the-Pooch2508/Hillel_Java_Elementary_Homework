package com.company.hm3;

public class Test {
    int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = ((int) (Math.random() * 12) - 15);
        System.out.println(arr);
    }
    int array[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * arr[i];
        System.out.println(array);
    }
}
