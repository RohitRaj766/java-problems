// Write a function to print the n th term of the Fibonacci series using recursion.

import java.util.Scanner;
public class fibonacciSeries {
    public static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        System.out.println("\nThe " + n + "th term of the Fibonacci series is: " + fibonacci(n - 1));
        
        scanner.close();
    }
}
