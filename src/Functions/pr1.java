package Functions;
import java.util.Scanner;

public class pr1 
{
    public static void Average ()
    {
        Scanner sc = new Scanner (System.in);
        int a, b, c, avg;
        System.out.println ("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        System.out.println("Enter the third number");
        c = sc.nextInt();
        avg = (a + b + c)/3;
        System.out.println ("The average is " + avg);
        sc.close();
    }

    public static void main (String[]args)
    {
        Average();
    }
}
