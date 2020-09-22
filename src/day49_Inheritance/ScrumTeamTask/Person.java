package day49_Inheritance.ScrumTeamTask;

public class Person {
/*
    public String name;
    public int age;
    public char gender;

    private long ssn; // we dont want this to be inherited to te sub classes

    public long getSsn(){ // read ssn only
        return ssn;
    }

    public void setSsn(long ssn){ // set ssn only
        this.ssn=ssn;
    }

    private void eat(){ // we dont want this to be inherited to te sub classes
        System.out.println(name + " is eating");
    }
    private void walk(){// we dont want this to be inherited to te sub classes
        System.out.println(name + " is walking");
    }
    public void sleep(){// we dont want this to be inherited to te sub classes
        System.out.println(name+ " is sleeping");
    }

    public void setInfo(String name, int age, char gender) { // only sets name, age, gender
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

*/
    public String name;
    public int age;
    public char gender;

    private long ssn; // we dont want this to be inherited to the sub classes

    public long getSsn(){
        return ssn;
    }// read ssn only

    public void setSsn(long ssn){
        this.ssn = ssn;
    }// set ssn only


    private void eat(){ // we dont want this to be inherited to the sub classes
        System.out.println(name +" is eating");
    }

    private void walk(){// we dont want this to be inherited to the sub classes
        System.out.println(name +" is walking");
    }

    public void sleep(){
        System.out.println(name +" is sleeping");
    }

    public void setInfo(String name,int age,char gender){  // only sets name, Age, Gender
        this.name=name;
        this.age=age;
        this.gender=gender;
    }



}
