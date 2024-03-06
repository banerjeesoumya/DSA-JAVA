package Functions;
import java.util.Scanner;

public class pr3 
{
    public static boolean isPalindrome (int p)
    {
        int t = p, d, rev = 0;
        while (t > 0)
        {
            d = t % 10;
            rev = rev * 10 + d;
            t = t / 10;
        }
        if (rev == p)
            return true;
        else
            return false;
    }
    
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = sc.nextInt();
        sc.close();
        if (isPalindrome(n) == true)
            System.out.println ("The enetered number is a Palindrome number");
        else
            System.out.println ("The entered number is not a Palindrome number");
    }
}
