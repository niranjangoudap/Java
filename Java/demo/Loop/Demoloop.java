package demo.Loop;

public class Demoloop {
    public static void main(String[] args) {
        
    int i,j;
    /*for(int i=1;i<=10;i++){
        System.out.println("i="+i);
    }
    /*for(int i=1;i>0;i++){
        System.out.println("i="+i);
    }
    for(i=1;i<=3;i++){ 
        for(j=1;j<=3;j++){
        System.out.println(i+" "+j);}

    }*/


    int n=1;
    while(n<10) {
        System.out.println("n ="+ n);
        n++;
    }


    int m=5;
    System.out.println("New Result");
    do { 
        
        System.out.println("m ="+ m);
        m++;
    } while (m<10);
}
}
