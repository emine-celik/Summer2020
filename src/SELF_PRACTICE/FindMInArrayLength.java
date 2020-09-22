package SELF_PRACTICE;

public class FindMInArrayLength {
    public static void main(String[] args) {
        String[] str={"ferda","emine","ayse"};

        int min=str[0].length();// minumum bulurken 0 verebiliriz ama MAXIMIM sayi vermemiz gerekiyor ismi yazdirabilmek icin

        for( String each : str){
            if(each.length()< min){// her birinin uzunlugu min den uzunsa
              min=each.length();

                System.out.println(each);  // for each loop un icine print satement yazdigimizda ismin kendini yaziyor


            }


        }

        System.out.println(min); // bu da en kucuk index numarayi veriyor




    }
}
