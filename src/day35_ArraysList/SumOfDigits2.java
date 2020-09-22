package day35_ArraysList;

public class SumOfDigits2 {
    public static void main(String[] args) {
        String str="a1b2c3";
        int sum=0;

        for(char each:str.toCharArray()){
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);

        // bun da da karakterin digit olup olmadigina bakiyoruz.
        // Character:
        // isDigit(char): verifies if the char is digit,returns boolean
        // isLtter






    }
}
