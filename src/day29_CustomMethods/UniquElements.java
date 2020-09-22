package day29_CustomMethods;



public class UniquElements {

    public static void main(String[] args) {
        String[] arr = {"A", "J", "B", "C", "C"};
        uniques(arr);
        System.out.println("Hello");
    }


    public static void uniques(String[] arr){

        for( String a: arr){ // gets each of the element

            int count = 0;
            for( String each: arr ){ // gets the frequency of the element
                if( a.equals(each) ){
                    count++;
                }

            }

            if(count == 1){ // unique
                System.out.print(a+" ");

            }
            System.out.println();
        }

    }




}
