
import java.util.Scanner;

public class opendoor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doorcode;
        System.out.println("Enter the doorcode:");
        doorcode = sc.nextInt();

        if (doorcode >= 0) {
            System.out.println("Doorcode is positive");
        } else {
            System.out.println("Doorcode is negative");

        }

    }
}
