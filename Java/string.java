import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();  // Read the entire line as a string

        // Find the length of the string
        int length = inputString.length();

        // Display the length of the string
        System.out.println("The length of the string is: " + length);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
