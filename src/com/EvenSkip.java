package com;

public class EvenSkip {
    public static void main(String[] args) {
        System.out.println("1 to 100 numbers by skipping even numbers");
        for (int i=1;i<=100;i++)
        {
            if (i%10==0)
            {
                System.out.println();
            }

                if (i%2==0)

            {
                continue;
            }
            System.out.println(i+" ");
        }
    }

}
