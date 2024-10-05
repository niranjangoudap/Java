public class instance {
    
       //public void Display(String name){
        //System.out.println("Name: "+ name);
       //
       public static int square(int num){
            return num * num;
       }
    

       public static void main(String[] args){

        //instance a = new instance();
        //a.Display("hi");
        int result = instance.square(5);
        System.out.println("Square of 5 is: "+result);
    }
}


