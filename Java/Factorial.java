
import java.util.Scanner;

public class Factorial {
    static int fact=1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        for (int i = num; i > 0; i--) {

            fact=fact*i;
        }
        System.out.println("Factorial:"+ fact);
    }

}
