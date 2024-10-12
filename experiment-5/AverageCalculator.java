// Write a function to find the average of a set of numbers passed as arguments.

public class AverageCalculator {
    public static double calculateAverage(double ...numbers) {
        if (numbers.length == 0) {
            return 0; 
        }
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double average = calculateAverage(10.5, 20.3, 30.2, 40.1);
        System.out.println("The average is: " + average);
    }
}
