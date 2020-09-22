package Office_Hours.Practice_07_20_2020;

/*
Task:
    write a program that can find the maximum number from any given two dimensional array

 */
public class Max_2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {8, 9, 11, 12},{13,14,15,16,17}};

        int max = arr2D[0][0];



        for(int j=0;j<=arr2D.length-1;j++){
            int[] eachArray = arr2D[j];
            for (int i = 0; i <= eachArray.length-1; i++) {

                int eachNum = eachArray[i];
                if (eachNum > max) {
                    max = eachNum;
                }
            }
            System.out.println("Maximum "+max);
        }

    }
}