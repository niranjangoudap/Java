import java.util.Scanner;
import javax.xml.transform.Templates;

public class Swap {
    
    public static void main(String[] args) {
        float temp;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number 1: ");
        float var1 = scanner.nextFloat();

        System.out.println("Enter a Number 2: ");
        float var2 = scanner.nextFloat();

        temp=var1;
        var1=var2;
        var2=temp;

        System.out.println("After Swapping Number1:"+ var1);
        System.out.println("After Swapping Number2:"+ var2);
    }
}
