import java.util.*;

public class matrixboundary {
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

            System.out.println("\nMatrix:\n");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                        System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Boundary Matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if((i==0 || i==3) || (j==0 || j==3)){
                        System.out.print(arr[i][j] + "\t");
                    }else{
                        continue;
                    }
                }
                System.out.println();
            }

            System.out.println("not Boundary Matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if((i==0 || i==3) || (j==0 || j==3)){
                     continue;
                    }else{
                        System.out.print(arr[i][j] + "\t");
                    }
                }
                System.out.println();
            }
    }
}
