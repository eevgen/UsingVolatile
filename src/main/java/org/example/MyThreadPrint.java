package org.example;

import java.util.Map;
import java.util.Random;

public class MyThreadPrint extends Thread{

    private static volatile boolean shouldDo = true;

    public static void setShouldDo(boolean shouldDo) {
        MyThreadPrint.shouldDo = shouldDo;
    }

    @Override
    public void run() {
        while(shouldDo) {
            Main.increaseNumber();
        }
    }
}
