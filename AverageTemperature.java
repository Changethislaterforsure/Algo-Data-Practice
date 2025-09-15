import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask how many days of temperature data
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        // Step 2: Create an array to store temperatures
        double[] temps = new double[days];

        // Step 2: Prompt user for all temperatures
        double sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble();
            sum += temps[i];
        }

        // Step 3: Calculate average
        double average = sum / days;
        System.out.println("Average temperature: " + average);

        // Step 4: Count how many are above average
        int aboveCount = 0;
        for (double temp : temps) {
            if (temp > average) {
                aboveCount++;
            }
        }

        // Step 5: Print result
        System.out.println("Number of days above average: " + aboveCount);

        scanner.close();
    }
}