package com;

public class MultiThread {
    public static void main(String[] args) {
        //Creating Thread to Print even numbers
        MultiThreadingUsingThread even = new MultiThreadingUsingThread();
        //Starting thread execution
        even.start();
        // Creating Thread to print odd numbers
        OddThread odd = new OddThread();
        //Starting Thread execution
        odd.start();

    }
}
