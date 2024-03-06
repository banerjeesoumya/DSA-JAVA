package Functions;
import java.util.Scanner;

public class BinDec 
{
    public static void convertBinDec (int p)
    {
        int t = p, d, rev = 0, pow = 0;
        while (t > 0)
        {
            d = t % 2;
            rev = rev + d * (int)(Math.pow(10, pow));
            pow ++;
            t = t / 2;
        }
        System.out.println("The decimal equivalent of " + p + " is " + rev);
    }
    
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter the decimal number");
        n = sc.nextInt();
        sc.close();
        convertBinDec(n);
    }    
}
