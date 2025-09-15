import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();

        
        double[] temps = new double[days];

        
        double sum = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temps[i] = scanner.nextDouble();
            sum += temps[i];
        }

        
        double average = sum / days;
        System.out.println("Average temperature: " + average);

        
        int aboveCount = 0;
        for (double temp : temps) {
            if (temp > average) {
                aboveCount++;
            }
        }

        
        System.out.println("Number of days above average: " + aboveCount);

        scanner.close();
    }
}