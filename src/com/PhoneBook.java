package com;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[]nm = new String[4];
        String[]phno = new String[4];
        for (int i=0;i<=3;i++)
        {
            System.out.println("Enter Name:");
            nm[i]= sc.nextLine();
            System.out.println("Enter Phone number:");
            phno[i]= sc.nextLine();
        }
        for (int i=0;i<=3;i++)
        {
            System.out.println("Name:"+nm[i]);
            System.out.println("Phone number:"+phno[i]);
        }
    }
}
