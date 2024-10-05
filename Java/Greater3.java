import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
public class Greater3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int n1= scanner.nextInt();

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the number2:");
        int n2= sca.nextInt();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number3:");
        int n3= sc.nextInt();

    if(n1>n2 && n1>n3)
    {
        System.out.println("Given n1 is greater");
    }
    else if(n2>n1 && n2>n3)
    {
        System.out.println("Given n2 is greater");   
    }
    else{
        System.out.println("Given n3 is greater");
    }
}
}
