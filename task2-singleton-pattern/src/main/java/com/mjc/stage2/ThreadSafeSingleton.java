package com.mjc.stage2;

import lombok.extern.slf4j.Slf4j;
import java.util.Objects;

@Slf4j
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){

    }
    public static ThreadSafeSingleton getInstance(){
        synchronized (ThreadSafeSingleton.class){
            if (Objects.isNull(instance)) {
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
