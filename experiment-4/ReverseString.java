// Write a Java Program to Reverse Each Word of a String.

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello, World";
        String[] characters = s.split("");
        Collections.reverse(Arrays.asList(characters));
        String reversedString = String.join("", characters);
        System.out.print(reversedString);
    }
}

// using loop

// public class ReverseString {
//     public static void main(String[] args) {
//         String s = "Hello, World";
//         String reversedString = reverseString(s);
//         System.out.print(reversedString);
//     }

//     public static String reverseString(String s) {
//         String result = "";
//         for (int i = s.length() - 1; i >= 0; i--) {
//             result += s.charAt(i);
//         }
//         return result;
//     }
// }
