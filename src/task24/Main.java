package az.coder.task1.task24;

class Counter {
    int count = 0;

    public synchronized int getCount() {
        return count;
    }

    public synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {
    final Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized(counter) {
                while(counter.getCount() % 5 == 0) {
                    try {
                        counter.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                counter.increment();
                System.out.println(counter.getCount());
                counter.notify();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);
        thread1.start();
        thread2.start();
    }
}
