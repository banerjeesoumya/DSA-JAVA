package Functions;

import java.util.Scanner;

public class pr4 
{
    public static int SumofDigits (int p)
    {
        int t = p, d, s = 0;
        while (t > 0)
        {
            d = t % 10;
            t = t / 10;
            s = s + d;
        }
        return s;
    }
    
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n, sum;
        System.out.println("Enter the number");
        n = sc.nextInt();
        sc.close();
        sum = SumofDigits(n);
        System.out.println("The sum of the digits of the number " + n + " is " + sum);
    }
}
