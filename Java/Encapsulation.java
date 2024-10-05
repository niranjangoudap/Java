
    class Person{
        private String name;
        private int age;
    
    //getter method for name
public String getname(){
    return name;

}

//Stter method for name
public void setname(String name){
    //we can add validation here if needs
    //if(name != null && name.isEmpty())
    if(name != null){
        this.name = name;
    }
    else{
        System.out.println("Invalid name: " + name);
    }
}
public int getage() {
    return age;
}

public void setage(int age) {
    if (age >0){
        this.age=age;
    }
    else {
        System.out.println("Invalid age: " + age);
    }
}
    }

    public class Encapsulation{
        public static void main(String[] args) {
            Person person = new Person();

            //set the name and age using setters method
        person.setname("Patil");
        person.setage(21);

        System.out.println("Name " + person.getname());
        System.out.println("Age " + person.getage());

        //this will be print an error message
        person.setage(-5);
        person.setname("N");
        }
    }
        
    