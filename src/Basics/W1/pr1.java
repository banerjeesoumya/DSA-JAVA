package Basics.W1;

import java.util.Scanner;

public class pr1 {
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int a, b, c, avg = 0;
        System.out.println ("Enter the number - a");
        a = sc.nextInt();
        System.out.println ("Enter the number - a");
        b = sc.nextInt();
        System.out.println ("Enter the number - a");
        c = sc.nextInt();
        avg = (a + b + c) / 3;
        System.out.println("The average is :- " + avg);
        sc.close();
    }
}
