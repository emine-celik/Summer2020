package Office_Hours.Practice_07_20_2020;

public class Max_3DArray {
    public static void main(String[] args) {
       // int[][] arr2D={{1,2,},{3,4}};

        int[][][] arr3D={{{1,2,},{3,4}},{{5,6,110},{8,9,10,90}} };

        int max=arr3D[0][0][1];

        for(int[][] each2D   :arr3D){
            for(int[] each1D :each2D){
                for( int eachElement :each1D){
                    if(eachElement>max){
                        max=eachElement;
                    }
                }

            }
        }

        System.out.println( "maximum: " +max);








    }
}
