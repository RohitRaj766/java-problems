import java.util.Scanner;

// public class nStd3subs {
//     public static int[][] inputMarks(int n) {
//         Scanner scanner = new Scanner(System.in);
//         int[][] marks = new int[n][3];
        
//         for (int i = 0; i < n; i++) {
//             System.out.println("Enter marks for student " + (i + 1) + ":");
//             for (int j = 0; j < 3; j++) {
//                 System.out.print("Subject " + (j + 1) + ": ");
//                 marks[i][j] = scanner.nextInt();
//             }
//         }
//         scanner.close();
//         return marks;
//     }

//     public static void computeAndDisplayHighestAverage(int[][] marks) {
//         double highestAverage = 0;
//         int studentIndex = 0;
        
//         for (int i = 0; i < marks.length; i++) {
//             double sum = 0;
//             for (int j = 0; j < 3; j++) {
//                 sum += marks[i][j];
//             }
//             double average = sum / 3;
//             System.out.println("Average marks for student " + (i + 1) + ": " + average);

//             if (average > highestAverage) {
//                 highestAverage = average;
//                 studentIndex = i + 1;
//             }
//         }

//         System.out.println("Student " + studentIndex + " has the highest average marks: " + highestAverage);
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of students: ");
//         int n = scanner.nextInt();

//         int[][] marks = inputMarks(n);
//         computeAndDisplayHighestAverage(marks);
//         scanner.close();
//     }
// }

class nStd3subs{
 static double max = 0;
    public static void main(String args[]){
        input();
    }
    public static void input(){
        int m1,m2,m3,n;
        double avg = 0;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Input the number of students");
        n =  sc.nextInt();
        for(int i = 0; i<n; i++){
            System.out.println("Enter mark 1 ::");
            m1 = sc.nextInt();
            System.out.println("Enter mark 2 ::");
            m2 = sc.nextInt();
            System.out.println("Enter mark 3 ::");
            m3 = sc.nextInt();
            avg = average(m1,m2,m3);
        }
        sc.close();
        System.out.println("Highest Avg :: "+ avg);
    }
    public static double average(int a, int b, int c){
        double avg;
        avg = (a+b+c)/3;
        if(avg > max){
            max = avg;
        }
        return max;
    }
}