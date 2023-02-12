package az.coder.task1.ChatGPT;

import java.util.concurrent.atomic.AtomicInteger;

class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(50);
                Main.number.decrementAndGet();
                System.out.println("Thread 1: " + Main.number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(100);
                Main.number.incrementAndGet();
                System.out.println("Thread 2: " + Main.number);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static AtomicInteger number = new AtomicInteger(0);
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}