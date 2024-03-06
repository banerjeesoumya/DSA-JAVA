package Functions;
import java.util.Scanner;

public class pr2 
{
    public static boolean isEven (int p)
    {
        if (p % 2 == 0)
            return true;
        else
            return false;
    }
    
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        if (isEven(n))
            System.out.println (n + " is an Even Number");
        else
            System.out.println (n + " is a Odd Number");
        sc.close();
    }
}
