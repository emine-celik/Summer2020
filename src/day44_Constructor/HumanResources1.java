package day44_Constructor;

import WurmUpStatic.Employee;

public class HumanResources1 {
    static Employee[] empArr={new Employee(),new Employee(),new Employee(),new Employee(),new Employee()};

    static {

        empArr[0].setInfo("Emine",1214,25756,"Sdet",120000,'F');
        empArr[1].setInfo("Zehra",1334,78556,"QA",140000,'f');
        empArr[2].setInfo("Erkan",1264,239876,"Po",100000,'M');
        empArr[3].setInfo("Elif",1934,21256,"BA",110000,'F');
        empArr[4].setInfo("Yusuf",1204,20986,"Sdet",110000,'F');
    }

}
