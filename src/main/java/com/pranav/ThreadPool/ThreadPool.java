package com.pranav.ThreadPool;

// important import statements
import java.util.Date;
import java.text.SimpleDateFormat;


public class ThreadPool implements Runnable {

    private String name;

    public ThreadPool(String s)
    {
        name = s;
    }

//    public void run() {
//        System.out.println("this is a thread pool");
//    }

    // Printing the task name and then sleeps for 1 sec
    // The complete process is getting repeated five times
    @Override
    public void run()
    {
        try
        {
            for (int j = 0; j <= 5; j++)
            {
                if (j == 0)
                {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

                    //prints the initialization time for every task
                    System.out.println("Initialization time for the task name: "+ name + " = " + sdf.format(dt));

                }
                else
                {
                    Date dt = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss");

                    // prints the execution time for every task
                    System.out.println("Time of execution for the task name: " + name + " = " +sdf.format(dt));

                }

                // 1000ms = 1 sec
                Thread.sleep(1000);
            }

            System.out.println(name + " is complete.");
        }

        catch(InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}
