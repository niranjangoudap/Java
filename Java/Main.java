class Bird {
    void fly() {
        System.out.println("Bird can fly");
    }
}

class Parrot extends Bird {
    void color() {
        System.out.println("I am Green");
    }
}

//inheriting class Parrot
class singleparrot extends Parrot{
    void sing(){
        System.out.println("I can sing");
    }
}
class cow  extends Bird{
    void whatcoloriam() {
        System.out.println("I am black");
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating a Parrot object
        Parrot p = new Parrot();
        cow s = new cow();

        //object method for parrot class 
        s.whatcoloriam();
        p.fly(); 

        //object for cow class
        p.fly();
        p.color();  
           
        
    }
}

//Multiple level inheritance
class A{
void testmethod(){

}}
class B{
void Mwthod(){
}
}

class extends A,B{

}