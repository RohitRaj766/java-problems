// Write a Java program that identifies the Even elements in two arrays and creates a third array with those elements.

public class findEven {
    public static void main(String[] args) {
        int arr1[] = {5, 2, 9, 8, 1, 7};
        int arr2[] = {15, 12, 19, 18, 11, 10};

        int evenCount = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                evenCount++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                evenCount++;
            }
        }

        int arr3[] = new int[evenCount];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr3[index++] = arr1[i];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                arr3[index++] = arr2[i];
            }
        }

        System.out.print("Even elements: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
