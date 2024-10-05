abstract class Animal {
    public abstract void sound();

public void sleep(){
    System.out.println("The animal is sleeping");
    }
}
class Dog extends Animal{
    @java.lang.Override
    public void sound(){
        System.out.println("The dog barks");
    }
}
class Cat extends Animal {

    @java.lang.Override

    public void sound(){
        System.out.println("Cat meow");
    }
}

public class Abstract{
    public static void main(String[] args) {
        Animal mydog = new Dog();
        Animal mycat = new Cat();
       

        mydog.sound();
        mycat.sound();

        mydog.sleep();
        mycat.sleep();

    }
}
