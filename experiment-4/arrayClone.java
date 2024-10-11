// Write a Java program in to copy the elements of one array into another array

public class arrayClone {
    public static void main(String[] args) {
        int arr[] = {5,2,9,8,1,7};
        int size = arr.length;
        int arrCopy[] = new int[size];
        int i = 0;
        for(int x:arr){
            arrCopy[i++] = x;
        }
        for(int x:arrCopy){
            System.out.print(x+" ");
        }
    }
}
