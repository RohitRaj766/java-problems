// Write a function to print the n th  term of the Fibonacci series using recursion.

public class fibonacciSeries {
    public static int fibonacci(int n){
        return fibonacci(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
