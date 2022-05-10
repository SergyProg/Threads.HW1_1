package ru.netology;

public class MyThread extends Thread {
    static final float DELAY = 2.5F;

    public MyThread(ThreadGroup mainGroup, String threadName) {
        super(mainGroup, threadName);
        start();
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep((int) DELAY * 1000);
                System.out.println("Я " + getName() + ". Всем привет!");
            }
        } catch (InterruptedException err) {
            //err.printStackTrace();
        } finally {
            //System.out.printf("%s завершен\n", getName());
        }
    }
}
