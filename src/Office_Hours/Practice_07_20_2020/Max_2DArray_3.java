package Office_Hours.Practice_07_20_2020;

public class Max_2DArray_3 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {8, 9, 11, 12},{13,14,20,15,16,17}};

        int max=arr2D[0][0];

        for( int i=0; i<= arr2D.length-1;i++) {  // to get each 1D Array

            for (int eachNum : arr2D[i]) { // to get each element
                if (eachNum > max) {
                    max = eachNum;
                }

            }

            System.out.println("Maximum: " + max);

        }
        }
}
