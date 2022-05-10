package ru.netology;

public class Main {
    static final float DELAY = 15F;
    static final String strStart = "Создаю потоки...";
    static final String strFinish = "Завершаю все потоки.";

    public static void main(String[] args) throws Exception {
        ThreadGroup mainGroup = new ThreadGroup("Main threads group");

        System.out.println(strStart);
        // полагаю, что запуск потока (start()) в данной задаче удобнее поместить в конструктор класса потока
        final Thread thread1 = new MyThread(mainGroup, "Поток1");
        final Thread thread2 = new MyThread(mainGroup, "Поток2");
        final Thread thread3 = new MyThread(mainGroup, "Поток3");
        final Thread thread4 = new MyThread(mainGroup, "Поток4");

        Thread.sleep((int) DELAY * 1000);

        System.out.println(strFinish);
        mainGroup.interrupt();
    }
}
