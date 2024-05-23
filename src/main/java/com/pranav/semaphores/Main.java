package com.pranav.semaphores;

import static com.pranav.semaphores.semaphoreExample.semaphore;

public class Main {
    public static void main(String[] args)
    {
        //prints the total number of available permits
        System.out.println("Total available Semaphore permits is: "+ semaphore.availablePermits());
        //creating four threads namely A, B, C, and D
        semaphoreExample.DemoThread t1 = new semaphoreExample.DemoThread("A");
        //staring thread A
        t1.start();
        semaphoreExample.DemoThread t2 = new semaphoreExample.DemoThread("B");
        //staring thread B
        t2.start();
        semaphoreExample.DemoThread t3 = new semaphoreExample.DemoThread("C");
        //staring thread C
        t3.start();
        semaphoreExample.DemoThread t4 = new semaphoreExample.DemoThread("D");
        //staring thread D
        t4.start();
    }
}
