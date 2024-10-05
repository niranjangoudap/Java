
import java.util.Scanner;

public class Eligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the Age:");
        age = sc.nextInt();

        if (age >= 21) {
            System.out.println("Eligible to marry.");
        } else {
            System.out.println("Nt eligible to marry.");

        }

    }
}
