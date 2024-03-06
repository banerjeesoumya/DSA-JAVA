package Basics.W3;

import java.util.Scanner;
public class pr1 {
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int n, i, se = 0, so = 0;
        System.out.println("Enter the limit");
        n = sc.nextInt();
        sc.close();
        for (i = 1; i <= n; i ++)
        {
            if (i % 2 == 0)
            {
                se = se + i;
            }
            else
            {
                so = so + i;
            }
        }
        //sc.close();
        System.out.println("Sum of even elements is " + se);
        System.out.println ("Sum of odd elements is " + so);
    }
}
