public class MultipleCatchBlockExample {
    public static void main(String[] args) {
        try {
            int arr[]= new int[5];
            arr[5]=0/30;
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticExpression divisible by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException: array index out of bond");
        }
        catch(Exception e){
            System.out.println("Exception : some other exception occured");
        }
        System.out.println("Rest of the code");
    }
}
