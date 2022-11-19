package com;

public class ExtractString {
    public static void main(String[] args) {
        //String of 10 Characters

        String str = "Laptop";
        System.out.println("Characters at odd index in Laptop String");
        for (int i=0;i<=str.length()-1;i++)
        {
            if (i%2==1)
            {
                System.out.println(str.charAt(i));
            }
        }
    }
}
