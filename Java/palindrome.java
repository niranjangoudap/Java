import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int sum=0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int r = scanner.nextInt();
        int k=r;

        while(r>0){
        int num=r%10;
        sum=(sum*10)+num;
        r=r/10;
        }

        if(k==sum){
        System.out.println("The entered num is palindrome");
        }
        else{
            System.out.println("The entered num is not palindrome");
        }
    }
}
