package com;

public class MultiThreadingUsingThread extends Thread {
    public void run()
    {
        System.out.println("Thread for even number");
        for (int i=1;i<=10;i++)
        {
            if (i%2==0)
            {
                System.out.println(i);

            }
        }
    }

}


