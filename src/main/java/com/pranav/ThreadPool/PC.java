package com.pranav.ThreadPool;
import java.util.concurrent.Semaphore;

class Q {

    int item;

    // sConsumer initialized with 0 permits to ensure put() executes first
    static Semaphore sConsumer = new Semaphore(0);

    static Semaphore sProducer = new Semaphore(1);

    void get()
    {
        try {
            sConsumer.acquire();
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        System.out.println("Consumer consumed item : " + item);
        sProducer.release();
    }

    void put(int item) {
        try {
            // Before producer can produce an items it must acquire a permit from sProducer
            sProducer.acquire();
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException caught");
        }
        this.item = item;
        System.out.println("Producer produced item : " + item);
        sConsumer.release();
    }
}

// Producer class
class Producer implements Runnable {
    Q q;
    Producer(Q q)
    {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run()
    {
        for (int i = 0; i < 5; i++)
            // producer put items
            q.put(i);
    }
}

// Consumer class
class Consumer implements Runnable {
    Q q;
    //constructor
    Consumer(Q q)
    {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
            // consumer get items
            q.get();
    }
}
//driver class
class PC {
    public static void main(String args[])
    {
        // creating buffer queue
        Q q = new Q();

        // starting consumer thread
        new Consumer(q);

        // starting producer thread
        new Producer(q);
    }
}
