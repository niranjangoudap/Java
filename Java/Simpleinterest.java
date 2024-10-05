import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class Simpleinterest {
    
    public static void main(String[] args) {
        
    //int prn, time,rate;

    Scanner scanner = new Scanner(System.in);

      System.out.println("Enter a principle: ");
        float prn = scanner.nextFloat();

      System.out.println("Enter a time: ");
      float time = scanner.nextFloat();
      
      System.out.println("Enter a Rateof interest: ");
      float rate = scanner.nextFloat();

      System.out.println("Simple Interest is : " +((prn*time*rate)/100));
}
}
