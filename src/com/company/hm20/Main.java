package com.company.hm20;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static com.company.hm20.TestRunner.start;

public class Main {

    public static void main(String[] args) throws RuntimeException, IOException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("Annotations result:");
        start(Tests.class);
    }
}
