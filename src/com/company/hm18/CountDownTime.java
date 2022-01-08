package com.company.hm18;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CountDownTime {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        System.out.println("START");
        executorService.scheduleAtFixedRate(
                new Runnable() {
                    long second = 5;
                    @Override
                    public void run() {
                        System.out.printf("%02d:%02d:%02d%n",TimeUnit.SECONDS.toHours(second),
                                TimeUnit.SECONDS.toMinutes(second), TimeUnit.SECONDS.toSeconds(second));
                        second--;
                        if(second==0){
                            System.out.println("THE END");
                        }
                    }
                },
                5L,
                1L,
                TimeUnit.SECONDS
        );
               executorService.shutdown();
    }


}
