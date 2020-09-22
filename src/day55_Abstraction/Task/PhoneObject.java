package day55_Abstraction.Task;

public class PhoneObject {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("11pro",1300,"Large");
        iphone.text();
        iphone.call();
        System.out.println(iphone);


        Samsung samsung = new Samsung("S8",1000,"Medium");
        samsung.text();
        samsung.call();
        System.out.println(samsung);

        Nokia nokia = new Nokia("Nokia",400,"Small");
        nokia.text();
        nokia.call();
        System.out.println(nokia);





    }
}
