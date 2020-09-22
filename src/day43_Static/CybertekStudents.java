package day43_Static;

public class CybertekStudents {
    // for the advantages of static

    String studentName;
    int age;
    char gender;
    static  String schoolName = "Cybertek School";


    public void getInfo(){

    }


    public String toString(String studentName,int age, char gender){
        return "Student Name: "+studentName+" Age: "+age+" Gender: "+gender;

    }

    public static void printSchoolName(){
        System.out.println("School Nmae: "+schoolName);
    }



}
