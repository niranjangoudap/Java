
import java.util.Scanner;

//import javax.sound.sampled.SourceDataLine;
public class Calculator {

    private static int index;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a operator:");
        char operation= scanner.next().charAt(0);
    
        System.out.println("Enter a num1:");
        int num1 = scanner.nextInt();

        //Scanner scn= new Scanner(System.in);
        System.out.println("Enter a num2:");
        int num2 = scanner.nextInt();

        //Scanner sca= new Scanner(System.in);
       
        //System.out.println("Choose an operation(+,-,*,/,%):");
        //char operation = scanner.next().charAt(0);
        double res;
        switch (operation) {
            case '+':
                res = num1 + num2;
                System.out.println("Result : " + res);
                break;
            case '-':
                res = num1 - num2;
                System.out.println("Result" + res);
                break;
            case '*':
                res = num1 * num2;
                System.out.println("Result" + res);
                break;
            case '/':
                res = num1 / num2;
                System.out.println("Result" + res);
                break;
            case '%':
                res = num1 % num2;
                System.out.println("Result" + res);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
