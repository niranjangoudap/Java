import java.util.Scanner;

public class Multiply {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number1:");
        double num1= scanner.nextDouble();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number2:");
        double num2= sc.nextDouble();

        System.out.println("Product:"+ num1*num2);
}
}
