package az.coder.task1.Thread;

public class Thread1 {
    public static  int num= 0;
    public static void main(String[] args) {
        Thread thread1 = new Thread(()->{
            //int localNum = num;
            for (; num < 100; num++){
                //num=localNum;
                try {
                    Thread.sleep(500);
                    System.out.println("Thread 1 : " + num);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });

        Thread thread2 = new Thread(()->{
            //int localNum=num;
            while (num!=0){
                num--;
                //num=localNum;
                try {
                    Thread.sleep(200);
                    System.out.println("Thread 2 : " + num);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            /*for (; localNum>0; localNum--){
                localNum--;
                num=localNum;
                System.out.println("Wedwedf");
                *//*try {
                    Thread.sleep(500);
                    System.out.println("Thread 2 : " + num);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*//*
            }*/
        });
        thread1.start();
        thread2.start();

    }
}
