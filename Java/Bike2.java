
public class Bike2{

 String brand;
    int year;

    //constructor
    public Bike2(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displaycarinfo() {
        System.out.println("car brand: " + brand);
        System.out.println("car manufacturer: " + year);
    }

    public static void main(String[] args) {
        Bike2 mycar = new Bike2("BMW", 1995);
        mycar.displaycarinfo();

    }
}
