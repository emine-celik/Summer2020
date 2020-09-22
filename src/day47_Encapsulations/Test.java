package day47_Encapsulations;

public class Test {
    public static void main(String[] args) {

        System.out.println( AccessModifiers.publicVariable ); //public is accesible from every where
        AccessModifiers.publicMethod();


        System.out.println(AccessModifiers.defaultVariable); // default
        AccessModifiers.defaultMethod();

        Encapsulation obj1 = new Encapsulation();
      //  System.out.println(obj1.ssn);
        System.out.println(obj1.getSsn());

        obj1.setSsn(23456789);
        System.out.println(obj1.getSsn()); // setter method eski verilen data yi degistirmeye yariyor.










    }

}
