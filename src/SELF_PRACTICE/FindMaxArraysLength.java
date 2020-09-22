package SELF_PRACTICE;

public class FindMaxArraysLength {
    public static void main(String[] args) {

        String[] str={"mahmut","ali","Kemal"};
        int max= str[2].length();// minumum bulurken 0 verebiliriz ama MAXIMIM sayi vermemiz gerekiyor ismi yazdirabilmek icin

        for(String each: str){
            if(each.length()>max){
                max=each.length();
                System.out.println(each);
            }
        }
        System.out.println(max);






    }
}
