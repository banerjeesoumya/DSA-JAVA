package Basics.W1;

import java.util.Scanner;

public class pr2 {
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        int side, area;
        System.out.println("Enter the side of the square");
        side = sc.nextInt();
        area = side * side;
        System.out.println("The area is : " + area);
        sc.close();
    }
}
