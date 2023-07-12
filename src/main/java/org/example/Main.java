package org.example;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        MyThreadPrint myThreadPrint = new MyThreadPrint();
        myThreadPrint.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        MyThreadPrint.setShouldDo(false);

    }
    public static void increaseNumber() {
        for (int i = 0; i < (new Random().nextInt(100, 1000)); i++) {
            System.out.println(i);
        }
    }
}