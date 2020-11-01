package day57_Polymorphism.PhoneTask;

public class PhoneObjects {
    public static void main(String[] args) {
        Iphone iphone= new Iphone("11 Pro","Large",1300);
        iphone.calling(12345678);
        iphone.faceTiming(1234567);
        iphone.texting(1234567);
        iphone.download();
        System.out.println(iphone);

        Samsung samsung = new Samsung("S8","Medium",800);
        samsung.calling(1234567);
        samsung.texting(1234567);
        samsung.freezing();
        samsung.download();
        System.out.println(samsung);


        Huawei huawei = new Huawei("x2","Small",400);
        huawei.calling(1234567);
        huawei.texting(1234563);
        huawei.download();
        huawei.stealInfo();
        System.out.println(huawei);

        Phone[] phones = {iphone,samsung,huawei};











    }
}
