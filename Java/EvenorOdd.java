
import java.util.Scanner;
import javax.sound.midi.Soundbank;
import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;


//import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

/*if(condition){
statement1;

statement2;
}
int num=5;
scanner sc= new scanner(System.in);*/
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();

    
    if(n%2==0)
    {
        System.out.println("Given number is even");
    }
    else
    {
        System.out.println("Given number is odd");   
    }
    
}
}
