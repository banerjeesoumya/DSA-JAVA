package Basics.W2;

import java.util.Scanner;

public class pr1 {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        if (n > 0)
            System.out.println ("The entered number is positive");
        else
            System.out.println ("The entered number is negative");
        sc.close();
    }
}
