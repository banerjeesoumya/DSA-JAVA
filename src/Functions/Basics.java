package Functions;
import java.util.Scanner;
public class Basics 
{
    public static void calculateSum(int a, int b)
    {
        int sum = a + b; 
        System.out.println("The sum is " + sum);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int a, b;
        System.out.println ("Enter the value of a ");
        a = sc.nextInt();
        System.out.println ("Enter the value of b ");
        b = sc.nextInt();
        calculateSum(a, b);
        sc.close();
    }    
}
