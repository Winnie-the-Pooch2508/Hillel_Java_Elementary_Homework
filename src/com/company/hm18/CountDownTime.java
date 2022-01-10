package com.company.hm18;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import static java.util.concurrent.TimeUnit.SECONDS;

public class CountDownTime {
    static int interval;
    static Timer timer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input seconds => : ");
        String secs = sc.nextLine();
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = Integer.parseInt(secs);
        System.out.println(secs);
        timer.scheduleAtFixedRate(new TimerTask() {

            public void run() {
                System.out.printf("%02d:%02d:%02d%n", SECONDS.toHours(interval),
                        SECONDS.toMinutes(interval), SECONDS.toSeconds(interval));
                interval--;
                if (interval == -1) {
                    System.out.println("THE END");
                    timer.cancel();
                }
            }
        }, delay, period);
    }
}