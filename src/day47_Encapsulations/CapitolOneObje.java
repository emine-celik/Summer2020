package day47_Encapsulations;

import java.util.Arrays;

public class CapitolOneObje {
    public static void main(String[] args) {

        CapitolBank employee1 = new CapitolBank("Emine",40,"SDET");
        System.out.println(employee1.companyName);

        employee1.setiD(123456);
        employee1.setSalary(110000);
        employee1.setAddress("4809 W College Ave");

        System.out.println(employee1.getiD());
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getAddress());
        System.out.println(employee1);
    }
}
