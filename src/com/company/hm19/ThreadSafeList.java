package com.company.hm19;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadSafeList {
    private final CopyOnWriteArrayList<Integer> sleep = new CopyOnWriteArrayList<>();

    public void add(int newSleep){
        sleep.add(newSleep);
    }
    public void remove(int index){
        sleep.remove(index);
    }
    public void get(int index){
        sleep.get(index);
    }
    static void doSleep() throws InterruptedException {
        Thread.sleep(ThreadLocalRandom.current().nextInt(3000, 10000));
    }
}