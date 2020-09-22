package day47_Encapsulations;

public class MyCredentials {

    public static void main(String[] args) {
        Credentials obj1 = new Credentials("emine",40);

        obj1.setUsername("emineclk");
        obj1.setPassword("Cybertek2345");

        System.out.println(obj1.getUsername());
        System.out.println(obj1.getPassword());

        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.companyName);




    }
}
