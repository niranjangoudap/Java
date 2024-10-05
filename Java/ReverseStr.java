import java.util.Scanner;

public class reversestr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String org = scanner.nextLine();

        String rev= new StringBuilder(org).reverse().toString();

        System.out.println("Original:" + org);
        System.out.println("Reverse:" + rev);
         
    }
}
