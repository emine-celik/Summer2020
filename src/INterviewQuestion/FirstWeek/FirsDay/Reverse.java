package INterviewQuestion.FirstWeek.FirsDay;

public class Reverse {
    public static void main(String[] args) {
        String str ="hello world";
        reversed(str);
        reversedArr(str);
    }

    public static void reversed(String str){
        String rev="";

        for (int i = str.length()-1; i >= 0 ; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }

    public static void reversedArr(String arr){

        String array[]= arr.split("");
        String arr2="";

        for (int i = array.length-1; i >= 0 ; i--) {
            arr2 += array[i];
        }
        System.out.println(arr2);

    }
}
