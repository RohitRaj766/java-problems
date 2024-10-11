// Write a Java program to test if a given string contains the specified sequence of char values.

import java.util.Scanner;

public class SubString2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        System.out.print("Enter the sequence to check: ");
        String sequence = scanner.nextLine();
        
        if (mainString.contains(sequence)) {
            System.out.println("The main string contains the specified sequence.");
        } else {
            System.out.println("The main string does not contain the specified sequence.");
        }

        scanner.close();
    }
}
