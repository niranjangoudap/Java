
//import javax.imageio.stream.MemoryCacheImageInputStream;

class Car {
    //declaration of private attribute
    private String modelName;
    private String owner;
    private int regnumber;

//declaration of public constructor
    public Car(String modelName, String owner,int regnumber){
        this.modelName=modelName;
        this.owner=owner;
        this.regnumber=regnumber;
}
//declaration of public methods
    public void startengine(){
        System.out.println("Car can be started");
    }
    public void acceleration(){
        System.out.println("Car can be accelerated");
    }
    public void stopengine(){
        System.out.println("Car can be stopped");
    }

    //print the attributes
    public void showCarInformation() {
        System.out.println("The car is owned by "+ owner);
        System.out.println("The car model is "+ modelName);
        System.out.println("The car register number is "+ regnumber);

    }

    //main method
    //Run|Debug
    public static void main(String[] args){
        Car mycar=new Car("Suzuki","Patil",2024);
        mycar.startengine();
        mycar.acceleration();
        mycar.stopengine();
    

    //display the car information
    mycar.showCarInformation();
}
}