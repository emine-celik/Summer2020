package day41_Static;

public class printingCustomClassObjects {
    public static void main(String[] args) {

       String str = new String("Cybertek");
        System.out.println(str.toString()); // object name
        System.out.println(new String("School").toString()); // object

        // even if you dindt give toString method it will still print the object,
        //complier call it for you MUST be called

        System.out.println("========================================");

        Carpet c1=new Carpet();
        c1.customOrder(5,6,19,true);

        System.out.println(c1);











    }
}
