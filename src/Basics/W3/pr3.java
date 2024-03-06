package Basics.W3;

import java.util.Scanner;

public class pr3 {
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int n, i;
        System.out.println("Enter the number");
        n = sc.nextInt();
        sc.close();
        for (i = 1; i <= 10; i ++)
        {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
