package com;

public class Staticblock {

        //defining static variable:-

         static int a;
         static short s;
         static float f;
         static double d;
         static String str;
         static char c;
         static boolean b;
         static byte b1;
         static {
         //Initializing values of static variables:-

         a=100;
         s=20;
         f=10236548f;
         d=1232.2323235656;
         str="Satyen";
         c= 'Y';
         b= true;
         b1=20;

            System.out.println("static block is executed");

        }

    public static void main(String[] args) {
        System.out.println("main method is executing..");
        //Printing values of static variables:-
        System.out.println("value of a:"+a);
        System.out.println("values of s:"+s);
        System.out.println("values of f:"+f);
        System.out.println("values of d:"+d);
        System.out.println("values of str:"+str);
        System.out.println("values of c:"+c);
        System.out.println("values of b:"+b);
        System.out.println("values of b1:"+b1);
    }


    }

