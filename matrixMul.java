import java.util.*;

public class matrixMul {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter the number of rows for the first matrix:");
            int row = sc.nextInt();
            System.out.println("Enter the number of columns for the first matrix:");
            int column = sc.nextInt();
    
            int arr[][] = new int[row][column];
            System.out.println("Insert " + (row * column) + " elements in the first matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("First Matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            
            System.out.println("Enter the number of rows for the second matrix:");
            int row2 = sc.nextInt();
            System.out.println("Enter the number of columns for the second matrix:");
            int column2 = sc.nextInt();
    
            int arr2[][] = new int[row2][column2];
                if (row2 != column) {
                System.out.println("The number of rows in the second matrix must match the number of columns in the first matrix for valid matrix multiplication.");
                return;
            }
    
            System.out.println("Insert " + (row2 * column2) + " elements in the second matrix:");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    arr2[i][j] = sc.nextInt();
                }
            }
    
            System.out.println("Second Matrix:");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print(arr2[i][j] + "\t");
                }
                System.out.println();
            }

            int arr3[][] = new int[row][column2];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < column; k++) {
                        arr3[i][j] += arr[i][k] * arr2[k][j];
                    }
                }
            }

            System.out.println("Result Matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print(arr3[i][j] + "\t");
                }
                System.out.println();
            }
            sc.close();
        }
    }
    
