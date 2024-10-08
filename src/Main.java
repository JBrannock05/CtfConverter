import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        while (true) {
            System.out.print("Enter temperature in Celsius (C): ");
            String input = scanner.nextLine();

            // Check if input is a valid double
            try {
                celsius = Double.parseDouble(input);
                break; // Valid input, exit the loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
            }
        }

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("Temperature in Fahrenheit (F): %.2f%n", fahrenheit);

        // Close scanner
        scanner.close();
    }
}