import java.util.Scanner;

public class Leapyear {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Year:");
        double year= scanner.nextDouble();

        if(((year%4==0) && (year%100 != 0)) || (year%400==0)){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
}
}
