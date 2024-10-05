class Animal {
    public void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    //subclass method override the superclass method
    public void sound(){
        System.out.println("The dog can barks");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("The cat moves");
    }
}

public class Override{
public static void main(){
    Animal a = new Animal();
    Dog g = new Dog();
    Cat c = new Cat();
    
    a.sound();
    g.sound();
    c.sound();
}
}
