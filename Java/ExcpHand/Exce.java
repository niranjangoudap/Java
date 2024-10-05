
public class Exce {
    public static void main(String[] args) {
        try {
            // risky code that may handle cause an exception
            int a=10/0; //this will throw Arithmetic Exception
            System.out.println("Result: " + a);
        } catch (ArithmeticException e) {
            System.err.println("Error Division by zero");
        }
        finally{
            System.out.println("This is final block");
        }
        System.out.println("Rest of the code..!");
    }
}
