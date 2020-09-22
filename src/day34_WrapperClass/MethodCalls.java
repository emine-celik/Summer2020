package day34_WrapperClass;

import Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        String target="longword";
        String word="foo";


        System.out.println(at3(target,word));



    }

    public static String at3(String target,String word)
    {
        String str= target.substring(0,3);
        String str2=target.substring(3);


        return str+word+str2;

    }





}

/*
wrapper class autoboxing ve nonboxing diye gecis yapiyor,
 eger wrapper dan primitive a gecis olursa unboxing, eger primitive den wrappera autoboxing
3:33
string to primitive parse metot, tring to wrapper value of metot kullaniliyor
3:34
ben mantigini soyle hayal ettim, wrapper diyor ve
iNTEGER mesela buyuk harfle basliyor,
int kucuk harfle basliyor, demekki wrap yapiyor onu direk aliyor kapsiyor diye kafada kurdum
 */




