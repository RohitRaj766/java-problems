// package experiment 4;
// Write a Java program to read n number of values in an array and display it in reverse order.

import java.util.Scanner;

public class displayReverse {

    public static void main(String args[]) {

        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
