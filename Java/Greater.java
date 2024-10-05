import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number1:");
        int n1= scanner.nextInt();

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the number2:");
        int n2= sca.nextInt();

    if(n1>n2)
    {
        System.out.println("Given n1 is greater");
    }
    else
    {
        System.out.println("Given n2 is greater");   
    }
    
}
}
