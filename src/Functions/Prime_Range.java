package Functions;
import java.util.Scanner;

public class Prime_Range 
{
    public static boolean isPrime (int n)
    {
        int i, c = 0;
        for (i = 1; i <= n; i ++)
        {
            if (n % i == 0)
                c ++;
        }
        if (c == 2)
            return true;
        else
            return false;
    }
    
    public static void PrimeinRange (int m)
    {
        int i;
        for (i = 0; i <= m; i ++)
        {
            if ((isPrime(i)))
                System.out.print (i + " ");
        }
    }

    public static void main (String[]args)
    {
        Scanner sc  = new Scanner (System.in);
        int p;
        System.out.println ("Enter the range");
        p = sc.nextInt();
        sc.close();
        PrimeinRange(p);
    }
}
