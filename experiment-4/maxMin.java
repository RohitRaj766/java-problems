// package experiment-4;
// Write a Java program to find the maximum and minimum element in an array.

import java.util.*;

public class maxMin {
    
    public static void main(String args[]){   
        
        Scanner ob = new Scanner(System.in);
        int arr[] = {5,2,9,8,1,7};
        int min = arr[0];
        int max = arr[0];
        int secMx = arr[0];
        int secMn = arr[0];
        ob.close();
        for(int i = 1; i<6; i++){
            if(min > arr[i]){
                secMn = min;
                min = arr[i]; 
            }
            if(max < arr[i]){
                secMx = max;
                max = arr[i];
            }
            if(secMx < arr[i] && arr[i] < max){
                secMx = arr[i];
            }
            if(secMn > arr[i] && arr[i] > min){
                secMn = arr[i];
            }
        }
        System.out.println("Min element = "+ min);
        System.out.println("Max element = "+ max);
        System.out.println("Second Max element = "+ secMx);
        System.out.println("Second min element = "+ secMn);
    
    }
}
