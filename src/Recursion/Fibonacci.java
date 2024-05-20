package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the term");
        n = sc.nextInt();
        System.out.println(findFibonacci(n));
    }

    private static int findFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return findFibonacci(n-1) + findFibonacci(n-2);
    }
}
