class ArrayTest{
    public static void main(String[] args) {
        /*int x[]={10,20,30,40};

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println("Length "+x.length);
            //Average calculation
            float sum=0;
        for (int j = 0; j < x.length; j++) {
            sum+=x[j];
            
        }
        System.out.println("Average: "+sum/x.length);*/


        //3D Array 
        int y[][][]=new int[3][4][5];
        //int i,j,k;
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 4; j++) 
                for (int k = 0; k < 5; k++) 
                    y[i][j][k]=i*j*k;

        for (i = 0; i < 3; i++){
            for (j = 0; j < 4; j++){
                for (k = 0; k < 5; k++){
                    System.out.println(y[i][j][k]+" ");
                    System.out.println();
                }
                System.out.println();
            }
        }

                
            }
        }