// package experiment-4;
// Write a Java program to calculate the average value of array elements.

import java.util.*;
public class averageArray {

    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        int sum = 0;
        int avg = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ob.nextInt();
            sum = sum + arr[i];
        }
        ob.close();
        avg = sum/n;
        System.out.println("AVERAGE = "+avg);
    }
}
