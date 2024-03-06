package Basics.W3;

import java.util.Scanner;
public class pr2 {
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int n, i, f;
        System.out.println("Enter the number ");
        n = sc.nextInt();
        sc.close();
        f = 1;
        for (i = 1; i <= n; i ++)
        {
            f = f * i;
        }
        System.out.println("The factorial of " + n + " is " + f);
    }
}
