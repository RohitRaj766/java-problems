// Write a Java program to check whether a given string ends with another string.

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        System.out.print("Enter the substring to check: ");
        String substring = scanner.nextLine();
        
        if (mainString.endsWith(substring)) {
            System.out.println("The main string ends with the given substring.");
        } else {
            System.out.println("The main string does not end with the given substring.");
        }

        scanner.close();
    }
}


