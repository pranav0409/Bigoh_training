package com.pranav.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static final int MAX_th = 3;
    public static void main(String[] args) {
        Runnable r1 = new ThreadPool("task1");
        Runnable r2 = new ThreadPool("task2");
        Runnable r3 = new ThreadPool("task3");
        Runnable r4 = new ThreadPool("task4");

        //creating a thread pool with max_th number of
        //threads size the pool size is fixed
       ExecutorService pl = Executors.newFixedThreadPool(MAX_th);
        //ExecutorService pl = Executors.newSingleThreadExecutor();
       // ExecutorService pl = Executors.newCachedThreadPool();

        pl.execute(r1);
//        pl.execute(r2);
//        pl.execute(r3);
//        pl.execute(r4);

        System.out.println(pl.isShutdown());


        pl.shutdown();

    }
}