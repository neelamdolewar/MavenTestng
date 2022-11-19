package com;

public class ArrayLiterals {
    public static void main(String[] args) {
        //1. Integer array literal:-
        int[]intArray = new int[3];
        intArray[0]=10;
        intArray[1]=20;
        intArray[2]=30;

        System.out.println("Length of integer Array:"+intArray.length);

        System.out.println("Elements of intArray using for each loop");
        for (int i:intArray)
        {
            System.out.println(i);
        }
        System.out.println("Elements of intArray using for loop");
        for (int i=0;i<=intArray.length-1;i++)
        {
            System.out.println(intArray[i]);
        }
        //2.Character array literal:-
        char[]charArray = new char[7];
        charArray[0]='B';
        charArray[1]='E';
        charArray[2]='L';
        charArray[3]='G';
        charArray[4]='A';
        charArray[5]='U';
        charArray[6]='M';

        System.out.println("Length of char array:"+charArray.length);
        System.out.println("Elements of charArray using for loop");
        for (char i:charArray)
        {
            System.out.println(i);
        }
        // 3. Float array literal:-
        float[] floatArray = new float[3];
        floatArray[0]= 10.987f;
        floatArray[1]= 15.235f;
        floatArray[2]= 24.862f;

        System.out.println("Length of float array:"+floatArray.length);
        System.out.println("Elements of floatArray using for loop");
        for (float f:floatArray)
        {
            System.out.println(f);
        }
        // 4. String array literal:-
        String[] stringarray = new String[4];
        stringarray[0]="Always";
        stringarray[1]=" God";
        stringarray[2]="Bless";
        stringarray[3]="You";

        System.out.println("Length of string array:" +stringarray.length);
        System.out.println("Elements of stringArray using for loop");
        for (String s: stringarray)
        {
            System.out.println(s);
        }

        // 5. Double array literal:-
         double[] doublearray = new double[3];
        doublearray[0]=12.5695647324;
        doublearray[1]=5362.94568721789;
        doublearray[2]=98.6321589478932;

        System.out.println("Length of double array:"+doublearray.length);
        System.out.println("Elements of doubleArray using for loop");
        for (double d: doublearray)
        {
            System.out.println(d);

        }









    }
}
