class Poly{
    public int add(int a, int b){
        return a+b;
    }
//overloading method for add 3 integers
    public int add(int a,int b,int c){
        return a+b+c;
    }

//overloading method for add 3 doubles
public double add(double a,double b){
    return a+b;
}
}
public class  Polymorphism{
    public static void main(String[] args) {
        Poly p = new Poly();
        System.out.println("Sum of the integers: "+p.add(10,20));
        System.out.println("Sum of the integers: "+p.add(3,5,2));
        System.out.println("Sum of the doubles: "+p.add(3.4,5.2));

    }
}
