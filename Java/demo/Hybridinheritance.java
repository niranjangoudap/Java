package demo;

public class Hybridinheritance {

    public static void main(String[] args) {
        D obj = new D();
        obj.Display();
    }
}

//superclass 
class A {

    int a = 1;

}

class B extends A {

    int b = 2;
}

//interface
interface C {

    int j = 3;
}

//extend and implementation together
class D extends B implements C {

    int d = 4;
    int sum = a + b + j + d;

    public void Display() {
        System.out.println("The value of a is " + a);
        System.out.println("The value of b is " + b);
        System.out.println("The value of c is " + C.j);
        System.out.println("The value of d is " + d);
        System.out.println("The value of sum is" + sum);
    }
}
