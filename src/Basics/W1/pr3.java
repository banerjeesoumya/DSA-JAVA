package Basics.W1;

import java.util.Scanner;

public class pr3 {
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        float p, pen, er, c = 0, tc = 0, gst;
        System.out.println ("Enter the cost of pencil");
        p = sc.nextFloat();
        System.out.println ("Enter the cost of pen");
        pen = sc.nextFloat();
        System.out.println ("Enter the cost of eraser");
        er = sc.nextFloat();
        c = p + pen + er;
        gst = (float)(0.18 * c);
        tc = c + gst;
        System.out.println("The total cost is :- " + c);
        System.out.println("After GST :- " + tc);
        sc.close();
    }
}
