package com;

class OddThread extends Thread {
    public void run()
    {
        System.out.println("Thread to print odd numbers");
        for ( int i=1;i<=10;i++)
        {
            if (i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}