
import java.util.Scanner;

public class LengthExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sring: ");
        String inputstr = scanner.nextLine();

        int length = inputstr.length();

        System.out.println(("The length of string is:" + length));
    }
}
