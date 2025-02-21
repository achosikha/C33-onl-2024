package lesson_20_threads;

public class MyMain {
    public static void main(String[] args) {
        // Процесс - это уровень компьютер, и позволяет работать в нескольких программах одновременно
        // Это возможность называется много-процессорность

        // Thread
        // Classic
        // Class implements Runnable
        // Class extends Thread

        // Anonymous
        // Simply, inside the class announce Thread and Runnable
        getLambdaThread();
    }

    public static void getLambdaThread(){
        // Classic
        new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Anonymous Thread");
                for (int num = 1; num <= 7; num++){
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Value: " + num);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        new Thread(() -> {
            Thread.currentThread().setName("Anonymous Lambda Thread");
            for (int num = 1; num <= 7; num++){
                System.out.println(Thread.currentThread().getName());
                System.out.println("Value: " + num);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }

    public static void getThreadAndRunnable(){
        MyRunnable tr1 = new MyRunnable();

        Thread t1 = new Thread(tr1);
        t1.setName("Thread via Runnable");
        t1.setPriority(10);
        t1.start();
    }

    public static void getClassThread(){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread 1");
        t1.setPriority(10);

        t2.setName("Thread 2");
        t2.setPriority(1);

        t1.start();
        t2.start();

        MyRunnable tr1 = new MyRunnable();
        MyRunnable tr2 = new MyRunnable();
        tr1.run();
        tr2.run();
    }

    public static void getBasicThread(){
        // Check whether we have a thread and get information
        // Every program has MAIN THREAD
        // If MAIN THREAD is over the program itself is over
        System.out.println(Thread.currentThread());

            try {
                for (int num = 1; num <= 10; num++) {
                    System.out.println("Value: " + num);
                    Thread.sleep(1500); // 1 second equals 1000 milliseconds, 1.5 seconds 1500 milliseconds
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try{
                for (int num = -10; num <= 0; num++){
                    System.out.println("Value: " + num);
                    Thread.sleep(2500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // Thread has ID, STATUS, PRIORITY, NAME
        // PRIORITY = 1 to 10
        // T1, T2, T3 -> Priority: 4, 7, 1
    }
}
