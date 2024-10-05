
public class Bike {

 String brand;
    int year;

    //constructor
    public Bike(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displaycarinfo() {
        System.out.println("car brand: " + brand);
        System.out.println("car manufacturer: " + year);
    }

    public static void main(String[] args) {
        Bike mycar = new Bike("BMW", 1995);
        mycar.displaycarinfo();

    }
}
