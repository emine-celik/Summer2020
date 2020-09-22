package day47_Encapsulations;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {

        Person info=new Person("Emine",40,'F', LocalDate.of(1980,06,25));


        System.out.println(info);

        info.setID(123456);
        info.setSsn(2345);
        info.setAddress("4809 W");

        System.out.println(info.getID());
        System.out.println(info.getSsn());
        System.out.println(info.getAddress());





    }
}
