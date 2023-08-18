package com.mjc.stage2;

import lombok.extern.slf4j.Slf4j;
import java.util.Objects;

@Slf4j
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
        // nothing to do here
    }

    public static ThreadSafeSingleton getInstance(){
        synchronized (ThreadSafeSingleton.class) {
            if (instance == null){
                instance = new ThreadSafeSingleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeSingleton_1 = ThreadSafeSingleton.getInstance();
        log.info("Is the same? " + threadSafeSingleton.equals(threadSafeSingleton_1));
    }
}
